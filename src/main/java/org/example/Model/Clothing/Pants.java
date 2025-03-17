package org.example.Model.Clothing;

public class Pants extends Clothing {
    private String fit;
    private String length;
    private double price = 500;
    // pris double


    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void showDetails() {
        System.out.println("Byxor detaljer: " + type + ", " +  material + ", Storlek: " + size + ", Färg: " + color + ", Fit: " + fit + ", Längd: " + length + ", Pris: " + price + " SEK");
    }
}
