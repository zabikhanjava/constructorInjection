package com.example.constructorInjection;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.PropertySource;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

public class some {

	public static void main(String[] args) {

		/*
		 * a a1=new a(); char aaaa=a1 .b() .c() .display() .concat("hello") .charAt(0);
		 */
		/*
		 * System.out.println(args[0]);
		 * System.out.println(System.getProperty("example"));
		 * //System.out.println(System.getenv()); Optional
		 * pop=Optional.ofNullable(null); try { String s=(String) pop.orElseThrow(null);
		 * System.out.println(s); } catch (Throwable e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */
		Optional op=Optional.ofNullable(null);
		String pop=(String) op.orElseGet(()->"zabi");
		System.out.println(pop);
		pop=(String) op.orElse("dd");
		System.out.println(pop);
	}

}

@Builder
class setttings
{
	public final int a;
	public final int b;
	public final int c;
}
class a
{
	public b b()
	{
		return new b();
	}
}
class b
{
	public c c()
	{
		return new c();
	}
}
class c
{
	public String display()
	{
		return "ddsd";
	}
}