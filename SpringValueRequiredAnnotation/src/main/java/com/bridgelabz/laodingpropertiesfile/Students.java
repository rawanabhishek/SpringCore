package com.bridgelabz.laodingpropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Students {
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	
	public void setName(String name) {
		System.out.println("Student name setter injected");
		this.name = name;
	}
	
	
	public void setIntrestedCourse(String intrestedCourse) {
		System.out.println("Student intrestedCourse setter injected");
		this.intrestedCourse = intrestedCourse;
	}
	
	
	public void setHobby(String hobby) {
		System.out.println("Student hobby setter injected");
		this.hobby = hobby;
	}
	 
	
	public void displayStudentInfo() {
		
		System.out.println("Student name "+name);
		System.out.println("Student intersted Course "+intrestedCourse);
		System.out.println("Student hobby "+hobby);
	}
	
	

}
