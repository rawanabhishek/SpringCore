package com.bridgelabz.aop.aspect;

import org.aspectj.lang.JoinPoint;
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

	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
	}
	
	@Before("args(name)")
	public void stringArgumentMethod(String name) {
		System.out.println("the name is "+name);
	}

	@Pointcut("within(com.bridgelabz.aop.model.Circle)")
	public void allCircleMethods() {
	}

	@Pointcut("execution(public * get*())")
	public void allGetters() {
	}

}
