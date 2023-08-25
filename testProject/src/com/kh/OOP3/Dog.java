package com.kh.OOP3;

public class Dog implements Animal,Cloneable{
	int age;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void eat(String food) {
		System.out.println(food + "너무 맛있다 (멍멍)");
	}
	@Override
	public void move() {
		System.out.println("멍멍 (꼬리를 흔들며)");
	}
	@Override
	public String toString() {
		return "안녕하세요.";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
