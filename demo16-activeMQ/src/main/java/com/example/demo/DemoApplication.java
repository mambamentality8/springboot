package com.example.demo;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

@SpringBootApplication
@EnableJms
public class DemoApplication{

    @Bean
    public Topic topic(){
        return new ActiveMQTopic("video.topic");
    }

    //common是队列的名称
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("common.queue");
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {

        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();

        bean.setPubSubDomain(true);

        bean.setConnectionFactory(activeMQConnectionFactory);

        return bean;

    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);
    }
}
