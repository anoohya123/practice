package com.springboot.starter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class helloController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("message","HELLO WORLD !");
        return "hello";
    }

    @RequestMapping(value="/style", method = RequestMethod.GET)
    public String applyStyle(){
        return "applyStyle";
    }

    @RequestMapping(value="/bootstrap", method = RequestMethod.GET)
    public String applyBootstrap(){
        return "applyBootstrap";
    }
}
