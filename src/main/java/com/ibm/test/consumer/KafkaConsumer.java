package com.ibm.test.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.ibm.test.service.KafkaService;

@Component
public class KafkaConsumer {
	
	@Autowired
	KafkaService kafkaService;
	
	@KafkaListener(topics = "${listener.topic}")
	public void listen(ConsumerRecord<String, String> record) throws Exception {
		kafkaService.receive(record);
	}

}