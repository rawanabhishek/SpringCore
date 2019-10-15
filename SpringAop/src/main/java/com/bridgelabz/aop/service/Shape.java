/******************************************************************************
 *  Purpose: Program is written for where all object of classes are hold
 *  		 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.aop.service;

import com.bridgelabz.aop.model.Circle;
import com.bridgelabz.aop.model.Triangle;

public class Shape {
	private Circle circle;
	private Triangle triangle;
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	

}
