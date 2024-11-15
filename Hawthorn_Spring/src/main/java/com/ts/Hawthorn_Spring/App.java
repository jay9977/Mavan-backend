package com.ts.Hawthorn_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	    // here we are making object 
		/*	Commen c = new Student();
		Commen cs= new Teacher();
		c.hello();
		cs.hello();*/
		// here the object make by spring 
		//application context is used to create an object and we pass the cofing.xml file
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
		Commen c= ac.getBean("std"/*Id*/,Commen.class/* interface*/);
		
		// Commen c= ac.getBaen("tch,Commen.Class);Same for teacher also
		
		c.hello();//method call
	}
}
