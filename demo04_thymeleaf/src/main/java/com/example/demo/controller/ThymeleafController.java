package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    @RequestMapping(value = "/api/v1/gopage")
    public Object index(){
        return "index";
    }
}
