package com.ts.Hawthorn_Spring3Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Student s = ac.getBean("std", Student.class);
		s.helloStudent();
	}
}
