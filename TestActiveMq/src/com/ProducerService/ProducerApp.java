package com.ProducerService;

import javax.servlet.jsp.jstl.core.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ProducerApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("producer.xml");
		  ProducerServer producerserver=context.getBean(ProducerServer.class);
		      producerserver.sendMessage("test");
	}

}
