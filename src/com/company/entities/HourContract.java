package com.company.entities;

import java.time.LocalDate;
public class HourContract {

	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;

	public HourContract(LocalDate dt, Double v, Integer h) {
		this.date = dt;
		this.valuePerHour = v;
		this.hours = h;
	}
	
	public LocalDate getDate() {
		return date; 
	}

	public Double totalValue() {
		return valuePerHour * hours;
	}
}
