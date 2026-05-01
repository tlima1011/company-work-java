package com.company.entities.enums;

public enum Section {
	
	TI(1), 
	RH(2), 
	Administrative(3), 
	Financial(4), 
	Accounting(5), 
	Shopping(6), 
	Sales(7), 
	Marketing(8);
	
	private final int code; 
	
	private Section(int code) {
		this.code = code; 
	}
	
	public int getCode() {
		return code; 
	}
}
