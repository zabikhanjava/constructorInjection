package com.example.constructorInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.constructorInjection.service.ConfigProperties;
import com.example.constructorInjection.service.Region;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
//mvn dependency:tree

//@Service
@RequiredArgsConstructor
public class ConstructorInj {

	 final ConfigProperties pro;
	
	public Region popoi() {
		// TODO Auto-generated method stub
		return pro.getRegion();
	}
}
