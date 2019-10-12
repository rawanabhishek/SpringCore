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
