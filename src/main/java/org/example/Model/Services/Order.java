package org.example.Model.Services;

import org.example.Controller.Observer.OrderObserver;
import org.example.Model.Clothing.Clothing;

public class Order {
    private Customer customer;
    private Clothing clothing;
    private OrderObserver orderObserver;

    public Order(Customer customer, Clothing clothing, OrderObserver orderObserver) {
        this.customer = customer;
        this.clothing = clothing;
        this.orderObserver = orderObserver;
        orderObserver.updateOrder("Plagget tillverkas: " + clothing.getClass().getSimpleName());
    }

    public void completeOrder() {
        orderObserver.updateOrder("Plagg klart: " + clothing.getClass().getSimpleName());
    }
}
