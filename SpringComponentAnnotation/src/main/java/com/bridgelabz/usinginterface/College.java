/******************************************************************************
 
 *  Purpose: College class for setter injection of principal and teacher  
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.usinginterface;




//@Component("collegeBean")
public class College {
	
	
	private Principal principal;
	
	
	private Teacher teacher;
	
	
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}



	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	public College(Principal principal) {
		
		this.principal = principal;
	}



	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("call method interface ");
	}

}
