package com.example.demo;

import com.example.demo.Interfaces.InterfaceOrderSystemSpring;
import org.springframework.stereotype.Component;

@Component
public class OrderSystem implements InterfaceOrderSystemSpring {

    //Attributes
    private int orderNumber;

    //Methods
    @Override
    public int incrementOrderNumber(int orderNumber) {
        this.orderNumber++;
        return this.orderNumber;
    }
}
