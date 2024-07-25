package com.kafka.code.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.fasterxml.jackson.databind.ser.std.ByteArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;

@Configuration
public class KafkaProducerConfiguration {
	
	
	@Value("${kafka.producer.topic}")
	String producerTopic;
	
	@Value("${bootstrap.server}")
	String kafkaServer;

	@Bean("KafkaProducerConfig")
	public ProducerFactory<String, byte[]> producerFactory(){
		
		Map<String, Object> props= new HashMap<>();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaServer);
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class);  
		
		return new DefaultKafkaProducerFactory<>(props);
		
		
	}
	
	
//	@Bean("KafkaProducerFactory")
//	public ProducerFactory<String, byte[]> producerFactory(){
//		return new DefaultKafkaProducerFactory<>(getProducerConfig());
//	}
	
	
	@Bean("kafkaProducerTemplate")
	public KafkaTemplate<String , byte[]> kafkaTemplate(ProducerFactory<String,byte[]> producerFactory){
		return new KafkaTemplate<>(producerFactory);
		
	}
	

}
