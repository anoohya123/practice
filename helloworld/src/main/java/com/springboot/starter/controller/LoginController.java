package com.springboot.starter.controller;

import com.springboot.starter.entity.UserModel;
import com.springboot.starter.form.LoginForm;
import com.springboot.starter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    UserService userService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String doLogin(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String postLogin(Model model, LoginForm loginForm) {
        System.out.println(loginForm.getEmail());
        try {

            UserModel userExists = userService.findByEmail(loginForm.getEmail().toLowerCase());
            if (userExists == null) {
                UserModel userModel = new UserModel();
/*
                userModel.setDoB(loginForm.getDoB());
*/
                userModel.setEmail(loginForm.getEmail().toLowerCase());
                userModel.setGender(loginForm.getGender());
                userModel.setMobile(loginForm.getMobile());
                userModel.setName(loginForm.getName());
                userModel.setPassword(bCryptPasswordEncoder.encode(loginForm.getPassword()));
                userService.save(userModel);
                return "home";

            }else {
                model.addAttribute("message","User already exists. Try to reset Password");
                return "login";
            }
        }catch (Exception e){
            return "error";
        }

    }
}
