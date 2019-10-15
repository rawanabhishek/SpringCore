
/******************************************************************************
 *  Purpose: Program is written for specifying the shape of circle
 *  		 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.aop.model;

public class Circle {
	
	private String name;

	public String getName() {
		
		return name;
	}

	public void setName(String name)  {
		this.name = name;
		throw(new RuntimeException());
	}
	
	public String returingAfter(String name) {
		return name;
		
	}

	
}
