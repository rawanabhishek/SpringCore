/******************************************************************************
 
 *  Purpose: To perform IOC container functionality 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.ioc;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Mobile {

	public static void main(String[] args) {
	
		
@SuppressWarnings("resource")
ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		
		
		Sim sim=context.getBean("sim" ,Sim.class);
		sim.calling();
		sim.data();
		
		
	}

}
