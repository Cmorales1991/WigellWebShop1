package org.example.Model;

public class Pants extends Clothing{
    public String fit;
    public String length;
    public double price = 500;
    // pris double

    public void setFit(String fit) {
        this.fit = fit;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void showDetails() {
        System.out.println("Byxor detaljer: " + material + ", Storlek: " + size + ", Färg: " + color + ", Fit: " + fit + ", Längd: " + length + ", Pris: " + price + " SEK");
    }
}
