package org.example.Model;

import org.example.Observer.OrderObserver;

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
