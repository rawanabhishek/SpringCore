package com.bridgelabz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.bridgelabz")
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
