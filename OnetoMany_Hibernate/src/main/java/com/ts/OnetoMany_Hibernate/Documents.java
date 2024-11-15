package com.ts.OnetoMany_Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Documents {
	// field
	@Id
	private int id;
	private String type;
	private String Number;// we are taking this because some documents contain alphabets.
	// getter & setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	// constructor
	public Documents() {

	}

	public Documents(int id, String type, String number) {

		this.id = id;
		this.type = type;
		Number = number;
	}

}
