package com.example.constructorInjection.components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Component
public class SomeDependency {

	public SomeDependency()
	{
		System.out.println("SomeDependency default cons");
	}
	public void showdependency() {

System.out.println("showing the depence");
	}

}
