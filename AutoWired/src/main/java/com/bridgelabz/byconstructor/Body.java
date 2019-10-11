package com.bridgelabz.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Body {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		HumanConstructor human=context.getBean("human3" ,HumanConstructor.class);
		human.startPumping();

	}

}
