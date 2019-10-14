/******************************************************************************
 
 *  Purpose: To perfrom auto wiring using by name
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.byname;

public class HumanName {
	private Heart heart;
	

	public void setHeart(Heart heart) {
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
