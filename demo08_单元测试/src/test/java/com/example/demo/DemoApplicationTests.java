package com.example.demo;

import com.example.demo.domain.ServerSettings;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	public ServerSettings serverSettings;

	@Test
	public void contextLoads() {
		System.out.println(serverSettings);
	}

	@Before
	public void testBefore(){
		System.out.println("before");
	}

	@After
	public void testAfter(){
		System.out.println("after");
	}
}
