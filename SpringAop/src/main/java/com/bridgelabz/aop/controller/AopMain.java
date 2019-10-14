package com.bridgelabz.aop.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.aop.service.Shape;

public class AopMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Shape shape=context.getBean("shapeService", Shape.class);
		shape.getCircle().setName("Abhishek");
		System.out.println(shape.getCircle().getName());
		
		
		
		((ClassPathXmlApplicationContext)context).close();
		
	

	}

}
