package com.example.demo.controller;

import com.example.demo.domain.JsonData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class demoController {
    @GetMapping("order")
    public Object order(String msg){

        return JsonData.buildSuccess();
    }
}
