/******************************************************************************
 
 *  Purpose: To perfrom perfrom auto wiring using qualifier
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Body {

	public static void main(String[] args) {
	
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		Human human=context.getBean("humanannotationqualifier" ,Human.class);
		human.startPumping();
		((ClassPathXmlApplicationContext)context).close();

	}

}
