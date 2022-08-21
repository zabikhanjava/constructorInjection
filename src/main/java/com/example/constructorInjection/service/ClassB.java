package com.example.constructorInjection.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ClassB
{

	public ClassB(ClassA classAInstance) {
		// TODO Auto-generated constructor stub
	}
	
	
}

class ClassA
{
	
}