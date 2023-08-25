package com.kh.javak;
import com.kh.javai.Student;

public class MainStart {
	public static void main(String[] args) {
		
		Student choi = new Student("소망", 26, "남자");
		Student kim = new Student("사랑", 23, "여자");		
		Student yoon = new Student("희망", 24, "남자");
		Student.showCount();
	}

}
