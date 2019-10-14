/******************************************************************************
 
 *  Purpose: To perform component Annoation dependency injection in spring  
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.usinginterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Client {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

		College college = context.getBean("collegeBean", College.class);
		System.out.println("The college object created by spring is  :"+college);
		college.test();

	}

} 
