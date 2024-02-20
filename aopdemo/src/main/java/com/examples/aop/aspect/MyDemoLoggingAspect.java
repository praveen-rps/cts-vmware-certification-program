package com.examples.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.examples.aop.dao.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging

    // let's start with an @Before advice

   // @Before("execution(public void addAccount())")
//	@After("execution(public void addAccount())")
	@Around("execution(public void addAccount())")
    public void beforeAddAccountAdvice(ProceedingJoinPoint preceedingJoinPoint) throws Throwable {

      //  System.out.println("This cross cutting method is called before bussiness method");
        System.out.println("This cross cutting method is called before bussiness method");
        preceedingJoinPoint.proceed();
        System.out.println("This cross cutting method is called after bussiness method");
      }
	
	@AfterReturning( pointcut = "execution(* com.examples.aop.dao.AccountDAO.*(..))",returning = "result")
	public void afterReturningAdvice(JoinPoint joinPoint, List<Account> result)
	{
		System.out.println("Executing @After Returning the value from bussiness class");
		System.out.println(result);
	}
	
	@AfterThrowing( pointcut = "execution(* com.examples.aop.dao.AccountDAO.findAccounts(..))", throwing="thwing")
	public void afterThrowingAdvice(JoinPoint joinPoint, Throwable thwing) {
		try {
		System.out.println("From the aspect class -->"+thwing.getMessage());
		}
		catch(Exception e) {
			
		}
	}
}











