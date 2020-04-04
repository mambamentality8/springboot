package com.example.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class CustomContextListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("======contextInitialized========");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("======contextDestroyed========");
		
	}

}
