/******************************************************************************
 *  Purpose: Program is written for putting the aspect by using @Aspect 
 *  		 annotation @Before will be invoked before getName() method called
 *  		 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
//	
//	@Before("allGetters()")
//	public void loggingAdvice() {
//		System.out.println(" advice run aspect called ");
//	}

//	@Before("allGetters()")
//	public void secondloggingAdvice() {
//		System.out.println(" second advice run aspect called ");
//	}
//
//	@Before("allCircleMethods()")
//	public void loggingAdvice(JoinPoint joinPoint) {
//		System.out.println(joinPoint.toString());
//	}
//	
//	@Before("args(name)")
//	public void stringArgumentMethod(String name) {
//		System.out.println("the name is "+name);
//	}
//
//	@Pointcut("within(com.bridgelabz.aop.model.Circle)")
//	public void allCircleMethods() {
//	}
//
////	@Pointcut("execution(public * get*())")
////	public void allGetters() {
////	}
//	
//	@Pointcut("execution(* *com.bridgelabz.aop.model.Circle.*(..))")
//	public void allGetters() {}

//	@After("args(name)")
//	public void StringArgumentMethod(String name) {
//		 System.out.println("A method that take string argument is called   "+name);
//	}

	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void StringArgumentMethods(String name, String returnString) {

		System.out.println("Hie  " + name);
		System.out.println("hello " + returnString);
	}

//	@AfterThrowing("args(name)")
//	public void exceptionAdvice(String name) {
//
//		System.out.println("Exception has been thrown");
//	}
	
	
	@AfterThrowing(pointcut="args(name)" ,throwing="ex")
	public void exceptionAdvice(String name ,RuntimeException ex) {
		System.out.println("An exception has been thrown"+ex);
	}
	

//	@Around("allGetters()")
//    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
//		try {
//			System.out.println("Before Advice");
//			proceedingJoinPoint.proceed();
//			System.out.println("After Returning");
//			
//		}catch(Throwable e) {
//			System.out.println("After thrwoing ");
//		}
//		System.out.println("After finally");
//	}
}
