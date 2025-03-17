package org.example.Controller;


import org.example.Controller.Builder.ClothingBuilder;
import org.example.Controller.Command.*;
import org.example.Model.Services.CEO;
import org.example.Model.Clothing.Clothing;
import org.example.Model.Clothing.Pants;
import org.example.Model.Clothing.Skirt;
import org.example.Model.Clothing.Tshirt;
import org.example.Model.Services.Customer;
import org.example.Model.Services.Order;
import org.example.Model.Services.Recipt;

import java.util.Observer;
import java.util.Scanner;

public class WebshopController {
    // Logiken
    Scanner scanner = new Scanner(System.in);
    CEO ceo = new CEO();
    Observer observer = (Observer) new CEO();

    //metod för att visa meny och dens val
        public void displayMenu() {
            System.out.println("Välkommen till Wigells webshop!");
            System.out.println("1. Skapa en beställning");
            System.out.println("2. Avsluta");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                createOrder();
            } else {
                System.out.println("Program avslutat.");
            }
        }

        //metod för att skapa order och sedan ta info från beställaren/Kunden
        private void createOrder() {

            System.out.print("Ange ditt förnamn: ");
            String customerFirstName = scanner.nextLine();

            System.out.print("Ange ditt efternamn: ");
            String customerLastName = scanner.nextLine();

            System.out.print("Ange din adress: ");
            String customerAddress = scanner.nextLine();

            System.out.print("Ange din mail: ");
            String customerMail = scanner.nextLine();

            Customer customer = new Customer("1", customerFirstName,customerLastName, customerAddress, customerMail);

            System.out.println("Välj plagg: (Byxor/Tshirt/Kjol)");
            String type = scanner.nextLine();

            System.out.println("Välj material: (Bomull/Jeans/Linne)");
            String material = scanner.nextLine();

            System.out.println("Välj storlek: (S/M/L)");
            String size = scanner.nextLine();

            System.out.println("Välj färg:");
            String color = scanner.nextLine();

            //bygger klädesobjekt via builder classen o buildermönster
            Clothing clothing = new ClothingBuilder(type)
                    .setType(type)
                    .setMaterial(material)
                    .setSize(size)
                    .setColor(color)
                    .build();

            //sedan anpassar med commandmönster
            applyCustoms(clothing);

            // Skapa order och lägger till CEO och meddelar CEO med observermönster... när det tillverkas och är klart..
            Order order = new Order(customer, clothing);
            order.addObserver(ceo);
            order.startProduction();
            order.completeOrder();

            //utskrift av kvitto
            Recipt.showRecipt(customer, clothing);

        }

        //Metod för att skapa anpassningar sedan  skapar o kör commando för anpassning för respektive typ
        private void applyCustoms(Clothing clothing) {
            CommandPipeline commandPipeline = new CommandPipeline();

            if (clothing instanceof Pants) {
                System.out.println("Ange passform (Slim/Regular): ");
                String fit = scanner.nextLine();
                commandPipeline.addCommand(new SetFitCommand(fit));

                System.out.println("Ange längd (Kort/Lång): ");
                String length = scanner.nextLine();
                commandPipeline.addCommand(new SetLengthCommand(length));
            }
            if (clothing instanceof Tshirt) {
                System.out.println("Ange nacke (Rund/V-ringad): ");
                String neck = scanner.nextLine();
                commandPipeline.addCommand(new SetNeckCommand(neck));

                System.out.println("Ange ärmlängd (Kort/Lång): ");
                String sleeves = scanner.nextLine();
                commandPipeline.addCommand(new SetSleevesCommand(sleeves));
            }
            if (clothing instanceof Skirt) {
                System.out.println("Ange midja (Hög/Låg): ");
                String waistline = scanner.nextLine();
                commandPipeline.addCommand(new SetWaistlineCommand(waistline));

                System.out.println("Ange mönster (Blommigt/Enfärgat): ");
                String pattern = scanner.nextLine();
                commandPipeline.addCommand(new SetPatternCommand(pattern));
            }
            commandPipeline.executeCommands(clothing);
        }
}
