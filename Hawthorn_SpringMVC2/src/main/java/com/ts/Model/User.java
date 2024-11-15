package com.ts.Model;
//Model File
public class User {
	private int id;
	private String name;
	private String add;

	public int getId() {
		return id;
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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public User() {
	}

	public User(int id, String name, String add) {

		this.id = id;
		this.name = name;
		this.add = add;
	}

}
