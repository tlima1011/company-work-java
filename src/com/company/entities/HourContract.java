package com.company.entities;

import java.time.LocalDateTime;

public class HourContract {

	private LocalDateTime date;
	private Double valuePerHour;
	private Integer hours;

	public HourContract(LocalDateTime dt, Double v, Integer h) {
		this.date = dt;
		this.valuePerHour = v;
		this.hours = h;
	}

	public Double totalValue() {
		return valuePerHour * hours;
	}
}
