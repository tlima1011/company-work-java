package com.company.entities.enums;

public enum WorkLevel {
	
	Junior(1),
	MidLevel(2),
	Senior(3); 
	
	private final int code; 
	
	private WorkLevel(int code) {
		this.code = code; 
	}
	
	public int getCode() {
		return code; 
	}

}
