package com.kafka.code.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.ByteArrayDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import com.fasterxml.jackson.databind.deser.std.StringDeserializer;

@Configuration
@EnableKafka
public class KafkaConsumerConfiguration {

	@Value("${bootstrap.server}")
	String server;
	@Value("${group.id}")
	String groupId;
	@Value("${auto.offset.reset}")
	String autoOffsetReset;
	@Value("${kafka.concurrency}")
	int kafkaConcurrency;

	@Bean(name = "KafkaConfiguration")
	public ConsumerFactory<String, byte[]> consumerFactory() {
		Map<String, Object> properties = new HashMap<>();
		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, server);
		properties.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ByteArrayDeserializer.class);
		properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, autoOffsetReset);
		properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
		properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "100");
		return new DefaultKafkaConsumerFactory<>(properties);

	}
	
	@Bean( name = "KafkaListnerContainer")
	public ConcurrentKafkaListenerContainerFactory<String, byte[]> kafkaListnerContainer(){
		ConcurrentKafkaListenerContainerFactory<String, byte[]> concurrentListner = new ConcurrentKafkaListenerContainerFactory();
		concurrentListner.setConcurrency(kafkaConcurrency);
		concurrentListner.setConsumerFactory(consumerFactory());
		return concurrentListner;
	}
	
	

}
