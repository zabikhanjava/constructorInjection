package com.example.constructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ConfigurationPropertiesScan("com.example")

public class ConstructorInjectionApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(ConstructorInjectionApplication.class, args);

		
	}

}
