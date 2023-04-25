package com.ff.kafkhademo.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MsgConsumer {

	@KafkaListener(topics = "demotopic",groupId = "mygroup")
	public void consumeMsg(String msg) {
		System.out.println(msg);
	}
}
