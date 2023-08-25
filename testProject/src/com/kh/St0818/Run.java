package com.kh.St0818;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human kim = new Student("김민수", 20);
		kim.makeSound();
		((Student)kim).sleep();
		((Student)kim).swim();
	}

}
