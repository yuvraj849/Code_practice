package com.kafkaproject.springboot.contoller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaproject.springboot.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageContoller {
	
	private KafkaProducer kafkaProducer;
	
	
	public MessageContoller(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}
	
	//http:localhost:8080/api/v1/kafka/publish?message=hello world
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message")String message){
		
		kafkaProducer.sendMessage(message);
		
		return ResponseEntity.ok("message sen to topic");
		
		
	}
}
