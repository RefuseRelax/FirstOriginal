package com.firstoriginal.online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @RequestMapping("/test")
    public String index(){
        System.out.println("劲来没");
        return "index";
    }

    @RequestMapping("/toWrite")
    public String toWrite(){
        System.out.println("劲来没");
        return "write";
    }

    @RequestMapping("/login")
    public String login(){
        System.out.println("劲来没");
        return "login";
    }
}
