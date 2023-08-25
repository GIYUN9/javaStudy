package com.kh.OPP3_pr;

public class Fish extends Animal implements Swimmable{
	
	public Fish(String name, int age) {
		super(name, age);
	}
	@Override
	public void swim() {
		System.out.println(this.name+"는 물을 헤엄친다.");
	}
	@Override
	public void makeSound() {
		System.out.println(this.name+"가 물에서 헤엄치고 있습니다.");
	}
}
