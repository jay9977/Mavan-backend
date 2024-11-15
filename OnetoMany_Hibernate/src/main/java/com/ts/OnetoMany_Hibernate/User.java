package com.ts.OnetoMany_Hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	// field
	@Id // it used to make something primary key
	private int id;
	private String name;
	// for one to many mapping
	@OneToMany
	private List<Documents> documents;

	// getter & setter
	public int getId() {
		return id;
	}

	public List<Documents> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Documents> documents) {
		this.documents = documents;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// constructor
	public User() {
	}

	public User(int id, String name, List<Documents> documents) {

		this.id = id;
		this.name = name;
		this.documents = documents;
	}

}
