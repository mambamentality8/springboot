package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.utils.JsonUtils;
import com.example.demo.utils.RedisClient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)  //底层用junit  SpringJUnit4ClassRunner
@SpringBootTest(classes={DemoApplication.class})//启动整个springboot工程
public class JsonTest {
	
	@Autowired
	private StringRedisTemplate strTpl;
	
	@Autowired
	private RedisClient redis;
	
	@Test
	public void testOne(){
		User u = new User();
		u.setAge(1);
		u.setPhone("22222");
		u.setPwd("0000");	
		
		String str = JsonUtils.obj2String(u);
		strTpl.opsForValue().set("str", str);
		System.out.println(str);
	}
}
