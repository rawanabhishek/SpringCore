/******************************************************************************
 
 *  Purpose: To create College Bean through java  
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.usinginterface;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration

public class CollegeConfig {
	
	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public College collegeBean() {
		College college =new College(principalBean()); 
		
		college.setTeacher(mathTeacherBean());
		return college;
	}
	
	

}
