/******************************************************************************
 
 *  Purpose: Model Clas For for Setter dependency injection using spring 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.dependency.setter;

public class StudentSetter {

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
