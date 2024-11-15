package com.ts.ManytoMany_Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Batch {
	// field
	@Id
	private int id;
	private String tuitor;
	private String sub;

	// getter & setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTuitor() {
		return tuitor;
	}

	public void setTuitor(String tuitor) {
		this.tuitor = tuitor;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	// constructor
	public Batch() {
	}

	public Batch(int id, String tuitor, String sub) {

		this.id = id;
		this.tuitor = tuitor;
		this.sub = sub;
	}

}
