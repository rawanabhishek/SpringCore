package com.bridgelabz.annotation.setter;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	
	private Heart heart;
	
	


	@Autowired
	public void setHeart(Heart heart) {
	System.out.println("Setter Auto Wired Called ");
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
