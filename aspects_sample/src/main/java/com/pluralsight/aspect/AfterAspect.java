package com.pluralsight.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAspect {

	@After("execution(* com.pluralsight..*(..))")
	public void printingAfter(JoinPoint joinpoint) {
		System.out.println("After Advice: exiting method '" + joinpoint.getSignature() + "'\n");
	}
}
