package com.ts.Hawthorn_Spring4Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component//to create object
@Aspect
public class Common {
	@Before("execution (public void helloStudent())")
	public void start() {
		System.out.println("Welocome");

	}
    @After("execution (public void hellowStudent()) ")
	public void end() {
		System.out.println("Buy Buy");

	}

}
