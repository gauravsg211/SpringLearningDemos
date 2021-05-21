package com.bbby.eom.service.order.cancel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class KlarnaOrderCancellationApplication {

	public static void main(String[] args) {
		SpringApplication.run(KlarnaOrderCancellationApplication.class, args);
	}

}
