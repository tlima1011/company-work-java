package com.company.entities;

import java.util.ArrayList;

import com.company.entities.enums.WorkLevel;

public class Worker {
	
	private String name; 
	private WorkLevel level; 
	private Double baseSalary; 
	private Department department; 
	private ArrayList<HourContract> contracts = new ArrayList<>(); 
	
	public Worker(String n, WorkLevel l, Double bs, Department d) {
		this.name = n; 
		this.level = l; 
		baseSalary = bs; 
		department = d; 
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract); 
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract); 
	}
	
	public Double income(int y, int m) { 
		double sum = baseSalary; 
		for (HourContract hc : contracts) {
			if (hc.getDate().getYear() == y && hc.getDate().getMonthValue() == m)
			{
			    sum += hc.totalValue();
			}
		}
		return sum;
	}
	
	@Override
	public String toString() {
		return String.format("\nName: %s\nDepartment: %s", this.name, this.department.toString());
	}
}
