package com.bridgelabz.byconstructor;

public class HumanConstructor {
	private Heart heart;
	

	public HumanConstructor(Heart heart) {
		
		this.heart = heart;
	}

//	public void setHeart(Heart heart) {
//		this.heart = heart;
//	}

	public void startPumping() {
		if(heart!=null) {
			
			heart.pump();
			}else {
				System.out.println("you are dead ");
			}
	}

}
