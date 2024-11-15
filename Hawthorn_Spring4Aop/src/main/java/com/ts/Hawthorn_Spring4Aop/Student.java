package com.ts.Hawthorn_Spring4Aop;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
	private Batch batch;

	public void helloStudent() {
		System.out.println("I am Studet");
		batch.helloBatch();

	}

}
