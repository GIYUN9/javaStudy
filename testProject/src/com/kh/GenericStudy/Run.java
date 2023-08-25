package com.kh.GenericStudy;

public class Run {

	public static void main(String[] args) {
//		Box<Apple> aBox = new Box<Apple>();
//		Box<Orange> oBox = new Box<Orange>();
//		
//		aBox.set(new Apple());
//		oBox.set(new Orange());
//		
//		Apple ap = aBox.get();
//		Orange og = oBox.get();
//		
//		System.out.println(ap);
//		System.out.println(og);
		
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("apple", 25);
		System.out.println(box);
		
	}

}
