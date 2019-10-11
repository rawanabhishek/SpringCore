/******************************************************************************
 
 *  Purpose: Class Aitel implementing Sim interface 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.ioc;

public class Airtel implements Sim {

	Airtel(){
		System.out.println("airtel constructor called");
		
	}
	
	@Override
	public void calling() {
		System.out.println("calling using airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("using airtel data");;
		
	}

}
