package com.ts.Hawthorn_hibernate2;

import org.hibernate.boot.registry.selector.spi.StrategySelector;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "ram") // (name="anyName is used to change the name of table and it create new table in
						// database")
public class Teacher {
	// field
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fullName") // is used to change the name of column
	private String name;
	private String subject;

	public int getId() {
		return id;
	}

	// getter & setter
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// constructor
	public Teacher() {
	}

	public Teacher(int id, String name, String subject) {

		this.id = id;
		this.name = name;
		this.subject = subject;
	}

	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

}
