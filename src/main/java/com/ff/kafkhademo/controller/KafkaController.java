package com.ff.kafkhademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ff.kafkhademo.producers.MsgProducer;

@RestController
@RequestMapping("/send")
public class KafkaController {

	@Autowired
	MsgProducer msgProducer;
	
	@PostMapping(value = "/stringmsg")
	public ResponseEntity<?> sendMessage(@RequestParam String msg){
		msgProducer.sendMessage(msg);
		return new ResponseEntity<>("message sent Successfully",HttpStatus.OK);
		
		
	}
	
}
