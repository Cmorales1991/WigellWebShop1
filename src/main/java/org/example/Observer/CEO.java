package org.example.Observer;

public class CEO implements OrderObserver{

    @Override
    public void updateOrder(String message) {
        System.out.println("VD: " + message);
    }
}
