package com.example.constructorInjection.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class somerndomcomponent{

	@Autowired
	SomeDependency somedependency;
	
	public somerndomcomponent()
	{
		System.out.println("somerndomcomponent default consructor");
	}
	public void d()
	{
		somedependency.showdependency();
	}
}
