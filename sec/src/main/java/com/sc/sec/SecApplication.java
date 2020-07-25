package com.sc.sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SecApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecApplication.class, args);
	}

}
