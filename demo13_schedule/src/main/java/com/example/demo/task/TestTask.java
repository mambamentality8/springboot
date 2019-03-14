package com.example.demo.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 功能描述：定时任务业务类
 */
@Component
public class TestTask {
//	@Scheduled(fixedRate=2000) //两秒执行一次
	public void sum(){
		System.out.println("当前时间:"+new Date());
	}
}
