package com.kafkaproject.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafkaproject.springboot.payload.User;

@Service
public class JsonKafkaConsumer {
	private static  final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	@KafkaListener(topics="yuvrajjsonTopic", groupId="myGroup")
	public void consume(User user) {
		LOGGER.info(String.format("Message sent %s ->",user.toString() ));
	}
}
