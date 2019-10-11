/******************************************************************************
 
 *  Purpose: To perform Setter dependency injection using spring 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.dependency.object;

public class AnotherStudent {
private Paper paper;
	
	
	
	
	public void setPaper(Paper paper) {
		this.paper = paper;
	}




	public void papers() {
		paper.paper();
	}
	
	
	

}
