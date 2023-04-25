package com.ff.kafkhademo.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class MsgProducer {
	
	
	
	@Autowired
	KafkaTemplate<String, String> template;
	
	public void sendMessage(String msg) {
		
		template.send("demotopic", msg);
		System.out.println("message sent successfully");
		
	}

}
