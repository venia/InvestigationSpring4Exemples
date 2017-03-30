package com.aquilla.example.xml.service.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstXmlSpringExample {
	public static void main (String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/example/FirstApplicationContext.xml");
		System.out.println("Started ...");
	}

}
