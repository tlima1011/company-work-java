package com.company.entities;

import com.company.entities.enums.WorkLevel;

public class Worker {
	
	private String name; 
	private WorkLevel level; 
	private Double baseSalary; 
	private Department department; 
	
	public Worker(String n, WorkLevel l, Double bs, Department d) {
		this.name = n; 
		this.level = l; 
		baseSalary = bs; 
		department = d; 
	}
	
	@Override
	public String toString() {
		return String.format("\nName: %s\nDepartment: %s", this.name, this.department.toString());
	}
}
