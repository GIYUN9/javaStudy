package com.kh.OPP3_pr;

public class Bird extends Animal implements Flyable{
	
	public Bird(String name, int age) {
		super(name, age);
	}
	@Override
	public void fly() {
		System.out.println(this.name+"는 하늘을 날아다닌다.");
	}
	@Override
	public void makeSound() {
		System.out.println(this.name+"이 하늘에서 울고있습니다.");
	}
}
