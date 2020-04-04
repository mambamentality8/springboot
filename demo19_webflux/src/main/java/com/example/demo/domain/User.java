package com.example.demo.domain;

import java.util.Date;

public class User {

	private String id;
	
	private String name;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	
	
	
}
