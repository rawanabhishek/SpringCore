package com.bridgelabz;

import org.springframework.stereotype.Component;

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
		System.out.println("call method");
	}

}
