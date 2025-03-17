package org.example.Model.Services;

import org.example.Controller.Observer.OrderObserver;
import org.example.Model.Clothing.Clothing;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private Clothing clothing;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(Customer customer, Clothing clothing) {
        this.customer = customer;
        this.clothing = clothing;
    }

    // metod för att lägga till observers , tex CEO mm..
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    // metod för att medella alla observers
    private void notifyObservers(String message) {
        for (OrderObserver observer : observers) {
            observer.updateOrder(message);
        }
    }
    // metod som meddelar när plagg påbörjas tillverkas
    public void startProduction(){
        notifyObservers("Plagg tillverkas: " + clothing.getClass().getSimpleName());
    }

    // metod som meddelar när plagget är färdig tillverkad
    public void completeOrder(){
        notifyObservers("Plagg är klart: " + clothing.getClass().getSimpleName());
    }





}