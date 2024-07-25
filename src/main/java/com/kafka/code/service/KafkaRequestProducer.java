package com.kafka.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.code.model.proto.kafkaRequest;

@Service
public class KafkaRequestProducer {
	
	@Autowired
	@Qualifier("kafkaProducerTemplate")
	KafkaTemplate<String, byte[]> kafkaTemplate;
	
	@Autowired
	KafkaEncoderDecoder kafkaE   ncoderDecoder;
	
	@Value("${kafka.producer.topic}")
	String producerTopic;
	
	@Value("${kafka.producer.key}")
	String producerKey;
	
	public void kafkaProducer(String name) {
		
		try {
			kafkaRequest encodedModel = kafkaEncoderDecoder.encodeModel();
			kafkaTemplate.send(producerTopic, producerKey, encodedModel.toByteArray());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(" >>>>>>>>>");
	}

}
