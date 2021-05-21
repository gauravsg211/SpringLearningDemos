package com.bbby.eom.service.order.cancel.listener;

import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.bbby.eom.service.order.cancel.model.TXML;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EmsListener {

	@JmsListener(destination = "${ems.destination.queuename}")
	public void receiveCOMessages(Message<String> message) {
		log.info("Subscribing message from queue for order Status....... ");

		if (log.isDebugEnabled()) {
			log.debug("OS-Message payload recieved:: {}", message.getPayload());
		}

		try {

			StringReader sr = new StringReader(message.getPayload());
			JAXBContext jaxbContext = JAXBContext.newInstance(TXML.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			TXML txml = (TXML) unmarshaller.unmarshal(sr);
			log.info("{}", txml);
		} catch (Exception e) {
			String errMsg = String.format(
					"Exception occured while receiving Order Status Xml from tibco Queue and exception is:%s", e);
			log.error(errMsg);
		}

	}

}
