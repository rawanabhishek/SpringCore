/******************************************************************************
 
 *  Purpose: To perfrom perfrom auto wiring using constructor injection
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.annotation.constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	
	private Heart heart;
	
	
	public Human() {
		
	}

	@Autowired
	public Human(Heart heart) {
	System.out.println("Constructor autowired called");
		
		this.heart = heart;
	}



	public void startPumping() {
		if(heart!=null) {
			
			heart.pump();
			}else {
				System.out.println("you are dead ");
			}
	}

}
