package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class demoController {
    private Map<String,Object> params = new HashMap<>();

    @GetMapping(value="/api/v1/account")
    public Object account(){
        params.put("money", "1000");
        return params;
    }
}
