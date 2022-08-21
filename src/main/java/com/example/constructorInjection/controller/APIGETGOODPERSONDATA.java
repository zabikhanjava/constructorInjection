package com.example.constructorInjection.controller;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.swagger.v3.oas.annotations.Operation;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)
@Operation(description="fetches the data on person")
@interface APIGETGOODPERSONDATA{  
}  