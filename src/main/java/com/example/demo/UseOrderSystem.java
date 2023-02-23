package com.example.demo;

import com.example.demo.Interfaces.InterfaceOrderSystemSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseOrderSystem {

        private final InterfaceOrderSystemSpring interfaceOrderSystem;

        @Autowired
        public UseOrderSystem(InterfaceOrderSystemSpring interfaceOrderSystem) {
            this.interfaceOrderSystem = interfaceOrderSystem;
        }

        public void UseOrderSystemForOrderNumber(int orderNumber) {
            orderNumber = interfaceOrderSystem.incrementOrderNumber(orderNumber);
            System.out.println("The new order number is (UseOrderSystem: " + orderNumber);
        }
    }

