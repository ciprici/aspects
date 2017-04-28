package com.pluralsight.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterReturningAspect {

	private static final Log LOG = LogFactory.getLog(AfterReturningAspect.class);

	@AfterReturning(pointcut = "execution(* com.pluralsight..*(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, String result) {
		LOG.trace("Returning from the method " + joinPoint.getSignature().getName() + " with result " + result);
		System.out.println("AfterReturning Advice: Returning from the method '" + joinPoint.getSignature().getName()
				+ "' with the result '" + result + "'\n");
	}

}
