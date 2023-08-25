package com.kh.HW0819;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String maker;
	
	public SmartPhone() {
		
	}
	
	public String printlnformation() {
		return this.maker;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
}
