package com.example.demo.controller;

import java.util.Date;

import com.example.demo.domain.MyException;
import com.example.demo.domain.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：异常测试
 *
 */
@RestController

public class ExcptionController {

	 
	/**
	 * 功能描述：模拟全局异常
	 * @return
	 */
	@RequestMapping(value = "/api/v1/test_ext")  
	public Object index() {
		int i= 1/0;
		return new User(11, "password", "13000000000", new Date());
	}

	
	/**
	 * 功能描述：模拟自定义异常
	 * @return
	 */
	@RequestMapping("/api/v1/myext")
	public Object myexc(){
		
		throw new MyException("499", "my ext异常");
		
	}
	
}
