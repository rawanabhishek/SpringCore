/******************************************************************************
 
 *  Purpose: MathTeacher class implementing Teacher interface 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.propertiesfile;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Teacher of maths ");

	}

}
