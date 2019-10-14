/******************************************************************************
 
 *  Purpose: To perform  Value required annotation using annotation
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.laodingpropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context =new  ClassPathXmlApplicationContext("beans.xml");
		
		Students stu=context.getBean("student", Students.class);
		stu.displayStudentInfo();
		
		
		
		
		

	}

}
