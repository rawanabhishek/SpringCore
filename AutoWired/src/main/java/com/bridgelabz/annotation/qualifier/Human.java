package com.bridgelabz.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;

	public Human() {

	}

	@Autowired
	@Qualifier("qualifier2")

	public void setHeart(Heart heart) {
		System.out.println("Setter Auto Wired Called ");
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {

			heart.pump();
		} else {
			System.out.println("you are dead ");
		}
	}

}
