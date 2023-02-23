package com.example.demo.ConfigurationClasses;

import com.example.demo.Interfaces.InterfaceOrderSystemSpring;
import com.example.demo.OrderSystem;
import com.example.demo.UseOrderSystem;
import com.sun.tools.javac.Main;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public InterfaceOrderSystemSpring interfaceOrderSystem() {
        return new OrderSystem();
    }

    @Bean
    public UseOrderSystem useOrderSystem(InterfaceOrderSystemSpring interfaceOrderSystem) {
        return new UseOrderSystem(interfaceOrderSystem);
    }

    @Bean
    public Main main(InterfaceOrderSystemSpring interfaceOrderSystem, UseOrderSystem useOrderSystem) {
        return new Main(interfaceOrderSystem, useOrderSystem);
    }

}
