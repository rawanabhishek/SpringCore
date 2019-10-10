package com.bridgelabz.dependency.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.dependency.setter.Student;

public class Exam {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context =new  ClassPathXmlApplicationContext("beans.xml");
		Student vishnu=context.getBean("vishnu" , Student.class);
		vishnu.displayStudentInfo();
		
		Student vinay=context.getBean("vinay" ,Student.class);
		vinay.displayStudentInfo();
	}

}
