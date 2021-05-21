package com.example.SimpleRedisPoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SimpleRedisPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRedisPocApplication.class, args);
	}

}
