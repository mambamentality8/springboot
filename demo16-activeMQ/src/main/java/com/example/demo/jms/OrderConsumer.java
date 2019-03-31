package com.example.demo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Component

public class OrderConsumer {

	@JmsListener(destination="order.queue")
	public void receiveQueue(String text){
		System.out.println("OrderConsumer收到的报文为:"+text);
	}
}
