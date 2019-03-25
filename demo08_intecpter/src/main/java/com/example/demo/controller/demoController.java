package com.example.demo.controller;

import com.example.demo.domain.JsonData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class demoController {
    private Map<String,Object> params = new HashMap<>();

    @GetMapping("order")
    public Object order(String msg){

        return JsonData.buildSuccess();
    }

    @GetMapping(value="/api2/v1/account")
    public Object account(){
        System.out.println(" controller -->account");
        params.put("money", "1000");
        return params;
    }
}
