package com.ts.ManytoMany_Hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	// field
	@Id
	private int rollNo;
	private String name;
	@ManyToMany
	private List<Batch> list;

	// getter & Setter
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Batch> getList() {
		return list;
	}

	public void setList(List<Batch> list) {
		this.list = list;
	}

	// constructor
	public Student() {
	}

	public Student(int rollNo, String name, List<Batch> list) {

		this.rollNo = rollNo;
		this.name = name;
		this.list = list;
	}

}
