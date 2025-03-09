package org.example.Model;

public class Tshirt extends Clothing{
   public String sleeves;
   public String neck;
   public double price = 120;
   // pris double

   @Override
   public void showDetails() {
       System.out.println("TShirt detaljer: " + type + ", " + material + ", " + size + ", " + ", " + color + ", Nackform: " + neck + ", Ärmlängd: " + sleeves + ", Pris: " + price + " SEK");
   }
}
