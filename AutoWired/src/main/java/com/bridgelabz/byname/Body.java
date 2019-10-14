/******************************************************************************
 
 *  Purpose: To perfrom auto wiring using by name
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
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
