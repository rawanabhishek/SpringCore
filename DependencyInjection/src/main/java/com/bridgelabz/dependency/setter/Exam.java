package com.bridgelabz.dependency.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context =new  ClassPathXmlApplicationContext("beans.xml");
		Student abhi=context.getBean("student" , Student.class);
		abhi.displayStudentInfo();
		
		Student rishi=context.getBean("rishi" ,Student.class);
		rishi.displayStudentInfo();


	}

}
