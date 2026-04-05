package com.company.entities;

public class Department {
	
	private String name; 
	
	public Department(String n) {
		this.name = n; 
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name; 
	}
}
