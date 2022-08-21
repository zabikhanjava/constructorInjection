package com.example.constructorInjection;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.example.constructorInjection.service.ConfigProperties;
//import com.example.constructorInjection.service.ConstructorInjectionService;
import com.example.constructorInjection.components.SomeDependency;
import com.example.constructorInjection.components.somerndomcomponent;
import com.example.constructorInjection.controller.*;

@SpringBootTest
@TestPropertySource(locations = "/application2.properties")
class ConstructorInjectionApplicationTests2 {
}
	/*@Autowired
	somerndomcomponent somerndomcomponent;
	
	@Mock
	SomeDependency someDependency;
	
	@Autowired
	ConstructorInjectionService constructorInjectionService1=new ConstructorInjectionService(somerndomcomponent);


	
	@Test
	public void pop()
	{
	constructorInjectionService1.pop();
	verify(someDependency).showdependency();
	}
	
	
	 * @Spy ConstructorInjectionService constructorInjectionService;
	 * 
	 * @InjectMocks ConstructorInjectionController constructorInjectionController;
	 * 
	 * @Value("${too}") String s;
	 * 
	 * @Autowired ConfigProperties pro;
	 * 
	 * @Test void some() { //System.out.println(pro.getHostName()); }
	 * 
	 * @Test void ds() { constructorInjectionController.diffofcompandconfig();
	 * verify(constructorInjectionService,times(1)).display(); }
	 
}*/
