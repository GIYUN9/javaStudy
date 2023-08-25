package com.kh.fig;
import java.util.*;

public class TriangleController {
	private Shape s;

	public TriangleController() {
		s = new Shape();
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(3, height, width);
		
		return (double)(width*height/2);
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "삼각형" + s.information();
	}
}
