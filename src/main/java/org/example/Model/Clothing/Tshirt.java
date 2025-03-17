package org.example.Model.Clothing;

public class Tshirt extends Clothing {
   private String sleeves;
   private String neck;
   private double price = 120;
   // pris double


   public String getSleeves() {
      return sleeves;
   }

   public void setSleeves(String sleeves) {
      this.sleeves = sleeves;
   }

   public String getNeck() {
      return neck;
   }

   public void setNeck(String neck) {
      this.neck = neck;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   @Override
   public void showDetails() {
       System.out.println("TShirt detaljer: " + type + ", " + material + ", " + size + ", " + ", " + color + ", Nackform: " + neck + ", Ärmlängd: " + sleeves + ", Pris: " + price + " SEK");
   }
}
