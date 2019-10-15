/******************************************************************************
 
 *  Purpose: to perfrom depency injection of object using setter injection  
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.dependency.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		
		ApplicationContext context =new  ClassPathXmlApplicationContext("beans.xml");
		
		Student stu=context.getBean("stu", Student.class);
		stu.papers();
		
		
		AnotherStudent another=context.getBean("anotherstudent", AnotherStudent.class);
		another.papers();
		
		((ClassPathXmlApplicationContext)context).close();
		

	}

}
