package com.company.entities.enums;

public enum WorkLevel {
	
	JUNIOR(1),
	MID_LEVEL(2),
	SENIOR(3); 
	
	private final int code; 
	
	private WorkLevel(int code) {
		this.code = code; 
	}
	
	public int getCode() {
		return code; 
	}

}
