 
/******************************************************************************
 
 *  Purpose: To perfrom spring autowiring using constructor injection
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/ 

package com.bridgelabz.annotation.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Body {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		Human human=context.getBean("humanannotationconstructor" ,Human.class);
		human.startPumping();

	}

}
