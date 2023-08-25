package com.kh.figTest;
import java.math.*;
public class Circle extends Point{
	private int radius;
	public final double PI = Math.PI;
	public Circle() {
		
	}
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return super.toString()+", "+radius;
	}
}
