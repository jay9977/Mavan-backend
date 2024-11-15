package com.ts.OnetoOne_Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
	// field
	@Id
	private int id;
	private String number;

//getter & setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

//constructor
	public Aadhar() {
	}

	public Aadhar(int id, String number) {

		this.id = id;
		this.number = number;
	}
}
