/******************************************************************************
 
 *  Purpose: using component annotation , Value and Varaiable  
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.propertiesfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.collegeName}")
	private String collegeName;	
	
	
	@Autowired
	private Teacher teacher;
	
	
	public void collgeInfo() {
		System.out.println("College Name is "+collegeName);
		teacher.teach();
	}
		
		
	





}
