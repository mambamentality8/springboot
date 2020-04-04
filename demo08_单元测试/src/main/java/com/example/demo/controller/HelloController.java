package com.example.demo.controller;


import com.example.demo.domain.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述：文件测试
 */
@Controller
@PropertySource({"classpath:application.properties"})
public class HelloController {
    @Autowired
    public ServerSettings serverSettings;

    @RequestMapping(value = "/api/v1/gopage")
    public Object index() {
        System.out.println(serverSettings);
        return "index";
    }
}
