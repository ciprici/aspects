package com.pluralsight.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {

	@Around(value = "execution(* com.pluralsight..*(..))")
	public Object printingAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		String methodInfo = proceedingJoinPoint.getSignature().toString();
		System.out.println("Around Advice: The method " + methodInfo + " was called");
		try {
			return proceedingJoinPoint.proceed();
		} catch (Throwable ex) {
			System.out.println("Around Advice: Catching exception with class " + ex.getClass().toString());
			throw ex;
		} finally {
			System.out.println("Around Advice: Running code in the finally block");
		}
	}
}
