package com.bbby.eom.service.order.cancel.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import com.tibco.tibjms.TibjmsConnectionFactory;

@Configuration
@EnableJms
public class TibcoEmsConfig {

	@Autowired
	PropertySource propertySource;

	@Bean("subscriberConnectionFactory")
	public TibjmsConnectionFactory subscriberConnectionFactory() {
		TibjmsConnectionFactory connectionFactory = new TibjmsConnectionFactory(propertySource.getEmsHostUrl());
		connectionFactory.setUserName(propertySource.getEmsUserName());
		connectionFactory.setUserPassword(propertySource.getEmsPassword());
		return connectionFactory;
	}


	@Bean
	public JmsListenerContainerFactory<?> queueSubscriberFactory(@Qualifier("subscriberConnectionFactory") TibjmsConnectionFactory connectionFactory,
			DefaultJmsListenerContainerFactoryConfigurer configurer) {
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setSessionTransacted(true);
		factory.setConcurrency(propertySource.getConcurrency());
		factory.setConnectionFactory(connectionFactory);
		//factory.setErrorHandler(errorHandler);
		configurer.configure(factory, subscriberConnectionFactory());
		return factory;
	}

}
