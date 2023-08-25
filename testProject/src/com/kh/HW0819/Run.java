package com.kh.HW0819;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] arr = new String[2];
		
		arr = pc.method();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\n");
		}
	}

}
