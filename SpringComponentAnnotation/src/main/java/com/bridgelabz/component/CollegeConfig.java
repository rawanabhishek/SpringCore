/******************************************************************************
 
 *  Purpose: To create College Bean through java  
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.bridgelabz.component")
public class CollegeConfig {
	

	
	
	@Bean
	public College collegeBean() {
		College college =new College(); 
		
		
		return college;
	}
	
	

}
