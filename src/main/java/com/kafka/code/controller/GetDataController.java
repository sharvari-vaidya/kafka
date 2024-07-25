package com.kafka.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.code.service.KafkaRequestProducer;


@RestController
public class GetDataController {
	@Autowired
	KafkaRequestProducer producer;
	
	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public void getData() {

		producer.kafkaProducer("abc");
		
	}
}
