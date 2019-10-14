/******************************************************************************
 
 *  Purpose: To perfrom auto wiring using by type
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Body {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		HumanType human=context.getBean("human2" ,HumanType.class);
		human.startPumping();

	}

}
