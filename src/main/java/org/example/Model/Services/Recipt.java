package org.example.Model.Services;

import org.example.Model.Clothing.Clothing;

public class Recipt {

    public static void showRecipt(Customer customer, Clothing clothing) {
        System.out.println("-------- Kvitto --------");
        System.out.println("ID: " + customer.getId());
        System.out.println("Kund: "+ customer.getFirstname() + " " + customer.getLastname());
        System.out.println("Adress: "+ customer.getAddress());
        System.out.println("Email: "+ customer.getEmail());
        System.out.println("Beställt plagg: ");
        clothing.showDetails();
        System.out.println("-------- Tack för köpet! --------");
        System.out.println("-------- Välkommen åter! --------");
    }

}
