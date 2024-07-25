package com.kafka.code.service;

import org.springframework.stereotype.Service;

import com.kafka.code.model.proto.kafkaRequest;
import com.kafka.code.model.proto.kafkaRequest.Builder;

@Service
public class KafkaEncoderDecoder {
	
	
	public kafkaRequest encodeModel() {
		kafkaRequest kafkaRequestProto= null;
		Builder proto=null;
		
		try {
			kafkaRequestProto= new kafkaRequest();
			return kafkaRequest.newBuilder().setName("abc")
					.setPrice(500)
					.setQty(50).build();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	

}
