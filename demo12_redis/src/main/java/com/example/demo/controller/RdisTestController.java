package com.example.demo.controller;

import com.example.demo.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/redis")
public class RdisTestController {

	@Autowired
	private StringRedisTemplate redisTpl; //jdbcTemplate

//	@GetMapping(value="add")
	public Object add(){
		
		//opsForValue : Returns the operations performed on simple values (or Strings in Redis terminology).
 
		redisTpl.opsForValue().set("name", "demo");
		
		return JsonData.buildSuccess();
		
	}
	
//	@GetMapping(value="get")
	public Object get(){
		
		String value = redisTpl.opsForValue().get("name");		
		return JsonData.buildSuccess(value);
	}
}
