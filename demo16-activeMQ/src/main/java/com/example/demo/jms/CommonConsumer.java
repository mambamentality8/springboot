package com.example.demo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CommonConsumer {

	
	@JmsListener(destination="common.queue")
	public void receiveQueue(String text){
		System.out.println("CommonConsumer收到的报文为:"+text);
	}
	
}
