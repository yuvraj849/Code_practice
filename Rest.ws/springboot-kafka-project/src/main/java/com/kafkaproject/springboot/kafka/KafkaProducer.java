package com.kafkaproject.springboot.kafka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	private static  final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
	private KafkaTemplate<String, String> kafkaTempalte;
	
	public KafkaProducer( KafkaTemplate<String, String> kafkaTempalte) {
		this.kafkaTempalte = kafkaTempalte;
	}
	
	public void sendMessage(String message) {
		LOGGER.info(String.format("Message sent %s", message));
		kafkaTempalte.send("yuvraj", message);
	}
}
