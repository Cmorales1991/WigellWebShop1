package org.example.Model.Clothing;

public class Skirt extends Clothing {
   private String waistline;
   private String pattern;
   private double price = 350;
   // pris double


    public String getWaistline() {
        return waistline;
    }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
   public void showDetails() {
        System.out.println("Kjol detalj: "+ type + ", " + material + ", " + size + ", " + color + ", Midjemått: " + waistline + ", Mönster: " + pattern + ", Pris: " + price + " SEK");

    }
}
