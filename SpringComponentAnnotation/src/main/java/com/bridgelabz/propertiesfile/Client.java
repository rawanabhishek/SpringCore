/******************************************************************************
 
 *  Purpose: To perform Setter dependency injection using spring 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.propertiesfile;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Client {

	public static void main(String[] args) {

	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

		College college = context.getBean("college", College.class);
		System.out.println("The college object created by spring is  :"+college);
		college.collgeInfo();
		
		context.close();
		
		

	}

} 
