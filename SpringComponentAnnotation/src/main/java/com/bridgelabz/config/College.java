package com.bridgelabz.config;



public class College {

	private Principal principal;

	public College(Principal principal) {

		this.principal = principal;
	}

	public void test() {

		System.out.println("call method config");
		principal.principalInfo();
	}

}
