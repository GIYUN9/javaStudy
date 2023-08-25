package com.kh.St0818;

public class Student extends Human implements Swimmable, Sleepable{

	public Student(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void sleep() {
		System.out.println(this.getName()+"님은 잠을 잡니다.");
	}

	@Override
	public void swim() {
		System.out.println(this.getName()+"님은 수영을 합니다.");
	}

	@Override
	void makeSound() {
		System.out.println("저는 "+this.getName()+"이고 "+this.getAge()+"살 입니다.");
		
	}
	
	
}
