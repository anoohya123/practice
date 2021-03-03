package com.crusadeFurniture.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    @RequestMapping(value="/welcome", method = RequestMethod.POST)
    public String welcomePage(Model model){
        model.addAttribute("welcometext","Welcome to Cruasde Furniture");
        return "welcome";
    }
    @RequestMapping(value="/welcome", method = RequestMethod.GET)
    public String welcomeForm(Model model){
        return "form";
    }
}

