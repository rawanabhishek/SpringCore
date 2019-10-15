/******************************************************************************
 *  Purpose: Program is written for running the @Aspect which will be invoked 
 *  		 before the getName() method calls
 *  		 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.aop.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.aop.service.Shape;

public class AopMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Shape shape=context.getBean("shapeService", Shape.class);
		shape.getCircle().setName("Abhishek");
		
		shape.getCircle().returingAfter("vishnu");
		
		
		
		
		((ClassPathXmlApplicationContext)context).close();
		
	

	}

}
