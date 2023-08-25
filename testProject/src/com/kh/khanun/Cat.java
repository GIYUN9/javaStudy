package com.kh.khanun;

public class Cat extends Animal{
	public Cat(String name, int age, String gender) {
		super(name, age, gender);
	}
	
	public void welcomHome() {
		System.out.println("숨는다.");
	}
	
	void makeSound() {
		System.out.println("야옹");
	}
}
