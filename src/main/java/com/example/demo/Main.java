package com.example.demo;

import com.example.demo.ConfigurationClasses.AppConfig;
import com.example.demo.Interfaces.InterfaceOrderSystemSpring;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@SpringBootApplication
@Component
public class Main {

	//Attributes
	public static int orderNumber = 0;
	private final InterfaceOrderSystemSpring interfaceOrderSystem;
	private final UseOrderSystem useOrderSystem;

	//Connect Main and InterfaceOrderSystem, UseOrderSystem Class
	@Autowired
	public Main(InterfaceOrderSystemSpring interfaceOrderSystem, UseOrderSystem useOrderSystem) {
		this.interfaceOrderSystem = interfaceOrderSystem;
		this.useOrderSystem = useOrderSystem;
	}

	//Methods
	//Test Main
	public void run() {
		//Test SystemOut
		System.out.println("order number in the beginning (Main): " + orderNumber);
		//Increment order number
		useOrderSystem.UseOrderSystemForOrderNumber(orderNumber);

		// Do something else here if needed
		// ...
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		// Get instance of Main class from Spring context
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Main main = context.getBean(Main.class);

		// Call run method on Main instance
		main.run();
	}
}
