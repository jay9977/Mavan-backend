package com.ts.Hawthorn_hibernate;

//This is An POJO File
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	// field
	@Id
	private int id;
	private String name;
	private String marks;

//getter & Setter
	public int getId() {
		return id;
	}

	public void setId(int rollno) {
		this.id = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

//constructor
	public Student() {
	}

	public Student(int rollno, String name, String marks) {

		this.id = rollno;
		this.name = name;
		this.marks = marks;
	}

}
