package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController_Web {

    @RequestMapping("/")
    public String getGreeting(){
        return "Heyo MF Sup?";
    }
}
