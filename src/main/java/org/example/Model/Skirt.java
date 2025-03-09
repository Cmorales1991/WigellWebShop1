package org.example.Model;

public class Skirt extends Clothing{
   public String waistline;
   public String pattern;
   public double price = 350;
   // pris double


   public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

   public void setPattern(String pattern) {
        this.pattern = pattern;
    }

   @Override
   public void showDetails() {
        System.out.println("Kjol detalj: " + material + ", " + size + ", " + color + ", Midjemått: " + waistline + ", Mönster: " + pattern + ", Pris: " + price + " SEK");

    }
}
