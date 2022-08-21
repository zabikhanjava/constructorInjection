package com.example.constructorInjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.constructorInjection.components.somerndomcomponent;

//@Service
//public class ConstructorInjectionService extends someservice {

	/*@Autowired
	somerndomcomponent some;
	@Autowired
	ClassB b;
	
	
	public String display()
	{
		System.out.println("it is called");
		System.out.println("I am b");
		return "I am fine"+b;
	}
	
	
	public ConstructorInjectionService(somerndomcomponent somerndomcomponent) {
		super(10);
		some=somerndomcomponent;
		System.out.println("in service Constructor");

	}

	public String pop() {
		some.d();
		return "dsds";
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub
		System.out.println("do ti");
	}

}

abstract class someservice {
	int a;

	someservice(int s) {
		System.out.println("in abstract class constructor");
		a = s;
	}

	public abstract void doit();
}
*/