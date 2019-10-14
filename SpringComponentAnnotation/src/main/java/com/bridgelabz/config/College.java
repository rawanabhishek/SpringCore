/******************************************************************************
 
 *  Purpose: college clas with test method   
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.config;



public class College {

	private Principal principal;

	public College(Principal principal) {

		this.principal = principal;
	}

	public void test() {

		System.out.println("call method config");
		principal.principalInfo();
	}

}
