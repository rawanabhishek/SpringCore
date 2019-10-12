package com.bridgelabz.propertiesfile;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.bridgelabz.propertiesfile")
@PropertySource("classpath:collegeinfo.properties")
public class CollegeConfig {

	
	

}
