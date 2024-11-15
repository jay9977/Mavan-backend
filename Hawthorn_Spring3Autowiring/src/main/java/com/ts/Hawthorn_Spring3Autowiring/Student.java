package com.ts.Hawthorn_Spring3Autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	// parameter
	@Autowired // if we write this then no need to write getter and setter
	private Batch batch;

	public void helloStudent() {
		System.out.println("I am Student");
		batch.helloBatch();//calling the batch class method 

	}

}
