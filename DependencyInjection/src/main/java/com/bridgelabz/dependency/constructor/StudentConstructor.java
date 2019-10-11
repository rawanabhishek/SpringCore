
/******************************************************************************
 
 *  Purpose: Model Clas For for Constuctor dependency injection using spring 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.dependency.constructor;

public class StudentConstructor {

	private String studentName;
	private int id;

	public StudentConstructor(String studentName, int id) {
		//super();
		this.studentName = studentName;
		this.id = id;
	}

	public void displayStudentInfo() {
		System.out.println("Student name is :  " + studentName + " and Student id is : " + id);

	}

}
