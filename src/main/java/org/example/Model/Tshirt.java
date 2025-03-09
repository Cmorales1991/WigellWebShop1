package org.example.Model;

public class Tshirt extends Clothing{
   public String sleeves;
   public String neck;
   public double price = 120;
   // pris double
   public void setSleeves(String sleeves) {
       this.sleeves = sleeves;
   }

   public void setNeck(String neck) {
       this.neck = neck;
   }

   @Override
   public void showDetails() {
       System.out.println("TShirt detaljer: " + material + ", " + size + ", " + ", " + color + ", Nackform: " + neck + ", Ärmlängd: " + sleeves + ", Pris: " + price + " SEK");

   }
}
