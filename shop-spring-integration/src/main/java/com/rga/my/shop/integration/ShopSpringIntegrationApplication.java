package com.rga.my.shop.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.integration.annotation.IntegrationComponentScan;

import java.util.Collections;

@SpringBootApplication
@IntegrationComponentScan
public class ShopSpringIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ShopSpringIntegrationApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8085"));
		ConfigurableApplicationContext context = app.run(args);

	}

}
