package com.example.demo.controller;

import com.example.demo.domain.JsonData;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController
@RequestMapping("/api/v1")
public class OrderController {
	

	/**
	 * 功能描述：微信支付回调接口
	 * @param msg 支付信息
	 * @return
	 */
	@GetMapping("order")
	public Object order(String msg){
		
       return JsonData.buildSuccess();
	}
	
	
	
	
	
	
	
	
	
	
	
}
