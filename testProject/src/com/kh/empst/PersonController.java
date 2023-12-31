package com.kh.empst;

public class PersonController {
	
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int stCount = 0;
		int emCount = 0;
		for(Student student : s) {
			if(student != null) {
				stCount++;
			}
		}
		for(Employee employee : e) {
			if(employee != null) {
				emCount++;
			}
		}
		int[] result = new int[2];
		result[0] = stCount;
		result[1] = emCount;
		return result;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i < s.length; i++) {
			s[i].setName(name);
			s[i].setAge(age);
			s[i].setHeight(height);
			s[i].setWeight(weight);
			s[i].setGrade(grade);
			s[i].setMajor(major);
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	
	public Employee[] printEmployee() {
		
		return null;
	}
}
