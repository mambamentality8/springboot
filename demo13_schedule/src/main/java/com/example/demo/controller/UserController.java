package com.example.demo.controller;

import java.util.concurrent.Future;

import com.example.demo.domain.JsonData;
import com.example.demo.task.AsyncTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class UserController {

	
	@Autowired
	private AsyncTask task;
	
	@GetMapping("async_task")
	public JsonData exeTask() throws InterruptedException{
		
		long begin = System.currentTimeMillis();
//
//		task.task1();
//		task.task2();
//		task.task3();

		Future<String> task4 = task.task4();
		Future<String> task5 = task.task5();
		Future<String> task6 = task.task6();
		for(;;){
			if (task4.isDone() && task5.isDone() && task6.isDone()) {
				break;
			}
		}

		
		long end = System.currentTimeMillis();
		
		long total = end-begin;
		System.out.println("执行总耗时="+total);
		return JsonData.buildSuccess(total);
	}
}
