package com.kh.fig;
import java.util.*;

public class SquareController {
	private Shape s;

	public SquareController() {
		s = new Shape();
	}
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width);

		return (s.getWidth()*2 + s.getHeight()*2);
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);
		
		return (s.getHeight() * s.getWidth());
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형" + s.information();
	}
}
