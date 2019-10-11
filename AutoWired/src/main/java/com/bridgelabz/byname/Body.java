package com.bridgelabz.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
	HumanName human=context.getBean("human" ,HumanName.class);
	human.startPumping();

	}

}
