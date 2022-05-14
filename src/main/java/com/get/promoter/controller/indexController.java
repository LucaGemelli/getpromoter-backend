package com.get.promoter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexController {

    @RequestMapping("/success")
    public String success() {
        return "success";
    }

    @RequestMapping("/extrato")
    public String extrato() {
        return "extrato";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("")
    public String index() {
        return "index";
    }
}
