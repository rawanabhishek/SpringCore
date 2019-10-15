
/******************************************************************************
 
 *  Purpose: To perfrom Constuctor dependency injection using spring 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.dependency.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context =new  ClassPathXmlApplicationContext("beans.xml");
		StudentConstructor vishnu=context.getBean("vishnu" , StudentConstructor.class);
		vishnu.displayStudentInfo();
		
		StudentConstructor vinay=context.getBean("vinay" ,StudentConstructor.class);
		vinay.displayStudentInfo();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
