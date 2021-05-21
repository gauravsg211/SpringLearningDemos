package com.bbby.eom.service.order.cancel.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Getter
@Setter
public class PropertySource {

	@Value("${ems.host.url}")
	private String emsHostUrl;

	@Value("${ems.destination.queuename}")
	private String emsQueueName;

	@Value("${ems.listener.concurrency}")
	private String concurrency;

	@Value("${ems.user.name}")
	private String emsUserName;
	
	@Value("${ems.user.password}")
	private String emsPassword;
	
}
