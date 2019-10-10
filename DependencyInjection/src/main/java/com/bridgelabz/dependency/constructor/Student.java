package com.bridgelabz.dependency.constructor;

public class Student {

	private String studentName;
	private int id;

	public Student(String studentName, int id) {
		//super();
		this.studentName = studentName;
		this.id = id;
	}

	public void displayStudentInfo() {
		System.out.println("Student name is :  " + studentName + " and Student id is : " + id);

	}

}
