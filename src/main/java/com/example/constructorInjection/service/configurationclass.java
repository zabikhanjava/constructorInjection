package com.example.constructorInjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configurationclass {
	

	@Bean
	public ClassA ClassAInstance()
	{
	
		return new ClassA();
	}
	@Autowired
	@Bean
	public ClassB ClassBInstance(ClassA a)
	{
	
		return new ClassB(a);
	}
	
}