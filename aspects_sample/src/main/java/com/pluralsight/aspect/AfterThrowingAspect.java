package com.pluralsight.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAspect {

	private static final Log LOG = LogFactory.getLog(AfterThrowingAspect.class);

	@AfterThrowing(pointcut = "execution(* com.pluralsight..*(..))", throwing = "exception")
	public void traceAfterThrowingException(JoinPoint joinPoint, RuntimeException exception) {
		LOG.trace("Logging after throwing exception " + exception.getMessage().getClass().toString());
		System.out.println("AfterThrowing Advice: Logging after throwing exception " + exception.getClass() + "\n");
		System.out.println("\n");
	}
}
