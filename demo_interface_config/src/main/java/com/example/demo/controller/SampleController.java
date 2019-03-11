package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping("/test")
    public Map<String,String> testMap(){
        Map<String,String> map = new HashMap<>();
        map.put("key","value");
        return map;
    }

    @GetMapping("/testjson")
    public Object testjson(){
        return new User(111, "abc123", "10001000", new Date());
    }
}
