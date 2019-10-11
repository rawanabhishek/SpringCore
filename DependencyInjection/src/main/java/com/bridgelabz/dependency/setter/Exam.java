
/******************************************************************************
 
 *  Purpose: To perform Setter dependency injection using spring 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.dependency.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context =new  ClassPathXmlApplicationContext("beans.xml");
		StudentSetter abhi=context.getBean("student" , StudentSetter.class);
		abhi.displayStudentInfo();
		
		StudentSetter rishi=context.getBean("rishi" ,StudentSetter.class);
		rishi.displayStudentInfo();


	}

}
