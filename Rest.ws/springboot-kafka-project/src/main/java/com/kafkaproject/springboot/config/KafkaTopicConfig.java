package com.kafkaproject.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	@Bean
	public NewTopic javaguidesTopic() {
		return TopicBuilder.name("yuvraj")
				.build();
	}
	@Bean
	public NewTopic yuvrajjsonTopic() {
		return TopicBuilder.name("yuvrajjsonTopic")
				.build();
	}
}
