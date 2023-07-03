package com.hamzath.mywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        session.setAttribute("name",name);
        System.out.println("Hi " + name);
        return "home";
    }
}

