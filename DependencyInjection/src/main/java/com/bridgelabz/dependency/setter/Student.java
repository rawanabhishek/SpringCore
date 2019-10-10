package com.bridgelabz.dependency.setter;

public class Student {

	String studentName;
	int id;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public void displayStudentInfo() {
		System.out.println("Student name is :  "+studentName+" and Student id is : "+id);

	}

}
