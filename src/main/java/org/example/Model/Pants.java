package org.example.Model;

import org.example.Controller.WebshopController;

public class Pants extends Clothing{
    public String fit;
    public String length;
    public double price = 500;
    // pris double

    @Override
    public void showDetails() {
        System.out.println("Byxor detaljer: " + type + ", " +  material + ", Storlek: " + size + ", Färg: " + color + ", Fit: " + fit + ", Längd: " + length + ", Pris: " + price + " SEK");
    }
}
