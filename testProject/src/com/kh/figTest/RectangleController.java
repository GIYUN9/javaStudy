package com.kh.figTest;

public class RectangleController {
	Rectangle r = new Rectangle(); // garbage collection
	
	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, width, height); 
		String str = r.toString()+" / "+ (r.getHeight()*r.getWidth());
		return str;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, width, height);
		String str = r.toString()+" / "+ (2*(r.getHeight()+r.getWidth()));
		return str;
	}
}
