/******************************************************************************
 
 *  Purpose: To create College Bean through java  
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.propertiesfile;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.bridgelabz.propertiesfile")
@PropertySource("classpath:collegeinfo.properties")
public class CollegeConfig {

	
	

}
