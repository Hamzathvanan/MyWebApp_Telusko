package com.hamzath.mywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home") // Add the URL path ("/home")
    public String home(){
        System.out.println("Hi home!");
        return "home";
    }
}

