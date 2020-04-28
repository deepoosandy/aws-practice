package com.aws.practice.rest.aspest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Around("execution(* com.aws.practice.rest.services.*.*())"
			+ "&& !@annotation(com.aws.practice.rest.aspest.NoLogging)"
			+ " && !@target(com.aws.practice.rest.aspest.NoLogging)")
	public void logBeforeAdvoice(JoinPoint joinPoint) {
		System.out.println("Start of the around advoice");

		System.out.println(joinPoint.getSignature());

		System.out.println("End of around advoice");
	}

	/*@After("execution(* com.aws.practice.rest.services.*.*())")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("Start of the after advoice");

		System.out.println(joinPoint.getSignature());

		System.out.println("End of after advoice");
	}*/

	/*@Around("execution(* com.aws.practice.rest.services.*.*())")
	public void logAround(JoinPoint joinPoint) {
		System.out.println("Start of the around advoice");

		System.out.println(joinPoint.getSignature());

		System.out.println("End of around advoice");
	}*/
}