package com.example.kafkaconsumer.config;
import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.converter.DefaultJackson2JavaTypeMapper;
import org.springframework.kafka.support.converter.Jackson2JavaTypeMapper.TypePrecedence;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

import com.example.kafkaconsumer.model.Message;
import com.example.kafkaconsumer.model.Primary;

@Configuration
@EnableKafka
public class ConsumerConfiguration {
	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;

	@Bean
	public Map<String, Object> consumerConfigs() {
		Map<String, Object> props = new HashMap<>();
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
		return props;
	}

	

	@Bean("retryBean")
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory(
			@Qualifier("consumerFactory") ConsumerFactory<String, String> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		factory.setMessageConverter(recordMessageConverter());
		return factory;
	}
	
	
	@Bean()
	public ConsumerFactory<String, String> consumerFactory() {
		return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(), new StringDeserializer());
	}
	
	
	@Bean
	public RecordMessageConverter recordMessageConverter() {
		StringJsonMessageConverter converter = new StringJsonMessageConverter();
		DefaultJackson2JavaTypeMapper typeMapper = new DefaultJackson2JavaTypeMapper();
		typeMapper.setTypePrecedence(TypePrecedence.TYPE_ID);
		typeMapper.addTrustedPackages("*");
		typeMapper.setIdClassMapping(recordMessageConverterClassMapping());;
		converter.setTypeMapper(typeMapper);
		return converter;
	}
	
	@Bean
	public Map<String, Class<?>> recordMessageConverterClassMapping() {
		Map<String, Class<?>> mappings = new HashMap<>();
		mappings.put(Message.class.getSimpleName(), Primary.class);
		return mappings;
	}
}




