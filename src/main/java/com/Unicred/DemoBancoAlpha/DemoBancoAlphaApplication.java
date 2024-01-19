package com.Unicred.DemoBancoAlpha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DemoBancoAlphaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBancoAlphaApplication.class, args);
	}

}
