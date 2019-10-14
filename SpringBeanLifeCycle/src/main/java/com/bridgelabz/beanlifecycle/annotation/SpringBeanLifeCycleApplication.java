/******************************************************************************
 
 *  Purpose: To perfrom Spring Bean Life Cycle ussing using annoation
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.beanlifecycle.annotation;


import java.sql.SQLException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBeanLifeCycleApplication {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		
		StudentDao student=context.getBean("studentDaoAnotation", StudentDao.class);
		student.getAllDetails();
		
		((ClassPathXmlApplicationContext)context).close();
		
		
		
	}

}
