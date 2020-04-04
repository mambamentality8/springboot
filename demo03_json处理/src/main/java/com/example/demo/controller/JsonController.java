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
public class JsonController {
    @GetMapping("/testjson")
    public Object testjson() {
        return new User(23, "abc123", "13000000000", new Date());
    }
}
