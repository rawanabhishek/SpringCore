/******************************************************************************
 
 *  Purpose: Class Vodaphone implementing Sim interface 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.ioc;

public class Vodaphone implements Sim {

	
	Vodaphone(){
		System.out.println("vodaphone constructor called ");
		
	}
	@Override
	public void calling() {
		System.out.println("calling using vodaphone sim");
		
	}

	@Override
	public void data() {
		System.out.println("using vodaphone data");;
		
	}

}
