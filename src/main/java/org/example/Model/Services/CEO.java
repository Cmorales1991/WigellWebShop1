package org.example.Model.Services;

import org.example.Controller.Observer.OrderObserver;

public class CEO implements OrderObserver {

    @Override
    public void updateOrder(String message) {
        System.out.println("VD: " + message);
    }
}
