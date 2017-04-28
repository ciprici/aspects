package com.pluralsight.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspect {

	private static final Log LOG = LogFactory.getLog(BeforeAspect.class);
	private boolean enteringCalled = false;

	@Before("execution(* com.pluralsight..*(..))")
	public void enteringMethod(JoinPoint joinPoint) {
		enteringCalled = true;
		LOG.trace("entering method " + joinPoint.getStaticPart().getSignature().toString());
		System.out.println(
				"Before Advice: entering method " + joinPoint.getStaticPart().getSignature().toString() + "\n");
	}

	public boolean isEnteringCalled() {
		return enteringCalled;
	}

}
