/******************************************************************************
 
 *  Purpose: To perfrom auto wiring using constructor 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Body {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		HumanConstructor human=context.getBean("human3" ,HumanConstructor.class);
		human.startPumping();
		((ClassPathXmlApplicationContext)context).close();

	}

}
