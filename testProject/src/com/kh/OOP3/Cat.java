package com.kh.OOP3;

public class Cat implements Animal{

	@Override
	public void eat(String food) {
		System.out.println(food + "너무 맛있다 (야 옹)");
		
	}

	@Override
	public void move() {
		System.out.println("야 옹 (꼬리를 흔들며)");
		
	}

}
