
/******************************************************************************
 
 *  Purpose: College class with method test to perfrom component Annoation
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.component;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

	public void test() {
	
		System.out.println("call method component");
	}

}
