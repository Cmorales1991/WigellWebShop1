package org.example.Model.Clothing;

public class Skirt extends Clothing {
   public String waistline;
   public String pattern;
   public double price = 350;
   // pris double


   @Override
   public void showDetails() {
        System.out.println("Kjol detalj: "+ type + ", " + material + ", " + size + ", " + color + ", Midjemått: " + waistline + ", Mönster: " + pattern + ", Pris: " + price + " SEK");

    }
}
