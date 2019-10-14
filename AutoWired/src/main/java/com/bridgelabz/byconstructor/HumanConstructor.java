/******************************************************************************
 
 *  Purpose: To perfrom auto wiring using constructor 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.byconstructor;

public class HumanConstructor {
	private Heart heart;
	

	public HumanConstructor(Heart heart) {
		
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
