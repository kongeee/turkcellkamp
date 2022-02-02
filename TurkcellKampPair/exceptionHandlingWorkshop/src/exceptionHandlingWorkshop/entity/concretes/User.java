package exceptionHandlingWorkshop.entity.concretes;

import exceptionHandlingWorkshop.entity.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String name;
	private String surName;
	private String email;
	private String password;
	
	public User() {
		super();
	}
	
	public User(int id, String name, String surName, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.email = email;
		this.password = password;
	}

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

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
