package com.kh.extendsjava;

public class BusinessMan extends Man {
	String company;
	String position;
	
	public BusinessMan() {
		System.out.println("BusinessMan 생성");
	}
	
	public BusinessMan(String company, String position, String name) {
		super(name);
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is "+ company);
		System.out.println("My position is "+ position);
		tellYourname();
	}
}
