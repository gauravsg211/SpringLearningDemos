package com.example.kafkaconsumer.consumer;

import java.io.IOException;
import java.text.ParseException;
import javax.xml.datatype.DatatypeConfigurationException;
import org.springframework.boot.json.JsonParseException;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.kafkaconsumer.model.Message;
import com.example.kafkaconsumer.model.Primary;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaConsumerReceiver {

	@KafkaListener(topics = "${spring.kafka.topic}", groupId = "${spring.kafka.consumer.group-id}", containerFactory = "retryBean")
	public synchronized void consumeKafkaReplayQueue(Message message) throws JsonParseException,
			JsonParseException, IOException, ParseException, DatatypeConfigurationException, Exception {

		log.info("kafka Received Message {}", message);
		//Primary kafkaMessage = new ObjectMapper().readValue(message, Primary.class);
		log.info("Received message from kafka topic: {}", message);

	}

}
