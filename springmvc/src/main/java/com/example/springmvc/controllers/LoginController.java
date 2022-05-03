package com.example.springmvc.controllers;

import com.example.springmvc.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.springmvc.repositories.UserRepository;


@Controller
public class LoginController {
    
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/login")
    public String login(@RequestParam String userId, @RequestParam String password){

// AISH CHECK LOGIN HERE
        
//      go to home page if successful
        return "redirect:/";
    }

}