package org.example.Controller;


import org.example.Builder.ClothingBuilder;
import org.example.Command.*;
import org.example.Model.*;
import org.example.Observer.CEO;

import java.util.Scanner;

public class WebshopController {
    // Logiken

         Scanner scanner = new Scanner(System.in);
         CEO ceo = new CEO();

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

            System.out.print("Ange ditt förnamn namn: ");
            String customerFirstName = scanner.nextLine();

            System.out.print("Ange ditt efternamn: ");
            String customerLastName = scanner.nextLine();

            System.out.print("Ange din adress: ");
            String customerAddress = scanner.nextLine();

            System.out.print("Ange din mail: ");
            String customerMail = scanner.nextLine();

            Customer customer = new Customer("1", customerFirstName,customerLastName, customerAddress, customerMail);

            System.out.println("Välj plagg: (byxor/tshirt/kjol)");
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

            // Skapa order och meddela VD med observermönster
            Order order = new Order(customer, clothing, ceo);
            order.completeOrder();

            //utskrift av kvitto
            Recipt.showRecipt(customer, clothing);

        }

        //Metod för att skapa anpassningar sedan  skapar o kör commando för anpassning för respektive typ
        private void applyCustoms(Clothing clothing) {
            if (clothing instanceof Pants) {
                System.out.println("Ange passform (Slim/Regular): ");
                String fit = scanner.nextLine();
                new SetFitCommand(fit).execute(clothing);

                System.out.println("Ange längd (Kort/Lång): ");
                String length = scanner.nextLine();
                new SetLengthCommand(length).execute(clothing);
            }
            if (clothing instanceof Tshirt) {
                System.out.println("Ange nacke (Rund/V-ringad): ");
                String neck = scanner.nextLine();
                new SetNeckCommand(neck).execute(clothing);

                System.out.println("Ange ärmlängd (Kort/Lång): ");
                String sleeves = scanner.nextLine();
                new SetSleevesCommand(sleeves).execute(clothing);
            }
            if (clothing instanceof Skirt) {
                System.out.println("Ange midja (Hög/Låg): ");
                String waistline = scanner.nextLine();
                new SetWaistlineCommand(waistline).execute(clothing);

                System.out.println("Ange mönster (Blommigt/Enfärgat): ");
                String pattern = scanner.nextLine();
                new SetPatternCommand(pattern).execute(clothing);
            }
        }
}
