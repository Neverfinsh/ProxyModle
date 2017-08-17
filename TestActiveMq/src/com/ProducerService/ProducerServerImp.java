package com.ProducerService;

import java.awt.font.TextMeasurer;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class ProducerServerImp  implements ProducerServer {
	
	@Autowired
	JmsTemplate jmstemplate;
	
	@Resource(name="queueDestionation")
	Destination destinatin;

	@Override
	public void sendMessage( final String message) {
     jmstemplate.send(destinatin, new MessageCreator() {
		@Override
		public Message createMessage(Session session) throws JMSException {
			
			TextMessage texemessage=session.createTextMessage(message);
			   System.out.println("发送消息"+texemessage.getText());
			return texemessage;
		}
	});
		
		 
		
		
	}

}
