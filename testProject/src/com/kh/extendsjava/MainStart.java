package com.kh.extendsjava;

public class MainStart {

	public static void main(String[] args) {
		// 객체를 생성할때 상속받은 클레스(부모)가 있다면
		// 부모클레스의 설계부터 확이낳고 자식클레스의 설계를 따른다.
//		Man choi = new Man();
//		choi.name = "jiwon";
//		choi.tellYourname();
		
		BusinessMan kim = new BusinessMan("KH","강사","최지원");
		kim.tellYourInfo();
//		kim.name = "junho";
//		kim.tellYourname();
	}

}
