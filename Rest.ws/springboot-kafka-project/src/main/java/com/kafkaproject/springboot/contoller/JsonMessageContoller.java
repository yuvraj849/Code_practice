package com.kafkaproject.springboot.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaproject.springboot.kafka.JsonKafkaProducer;
import com.kafkaproject.springboot.payload.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageContoller {
	
	private JsonKafkaProducer kafkaProducer;

	public JsonMessageContoller(JsonKafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user){
		kafkaProducer.sendMessage(user);
		
		return ResponseEntity.ok("JsonMessage message is sent");
		
	}
}
