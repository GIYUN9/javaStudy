package com.kh.figTest;

public class CircleController {
	Circle c = new Circle(); //garbage collection
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		String str = c.toString() + " / "
				+ (c.PI * (c.getRadius() * c.getRadius()));
		return str;
	}
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		String str = c.toString()+ " / "
				+ (c.PI * c.getRadius() * 2);
		return str;
	}
}
