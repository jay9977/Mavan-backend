package com.ts.Hawthorn_Spring2Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//application context is helps to create object
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		// calling setter Injection set value
		Teacher t = ac.getBean("tch", Teacher.class);
		System.out.println(t.getName());// getting name set by bean in config.xml
		System.out.println(t.getId());// getting id set by bean in config.xml

		// calling constructor injection set value
		Teacher t2 = ac.getBean("tch2", Teacher.class);
		System.out.println(t2.getName());// getting name set by bean from config.xml
		System.out.println(t2.getId());// getting id set by bean in config.xml
	}
}
