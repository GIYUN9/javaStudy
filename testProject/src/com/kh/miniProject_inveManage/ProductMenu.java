package com.kh.miniProject_inveManage;
import java.util.*;
public class ProductMenu {
	Scanner sc = new Scanner(System.in);
	Customer c = new Customer();
	Admin a = new Admin();
	public ProductMenu() {
		
		while(true) {
			int menuNum;
			System.out.println("====== Main ======");
			System.out.println("1. 고객 메뉴");
			System.out.println("2. 관리자 메뉴");
			System.out.println("9. 프로그램 종료");
			System.out.print("번호를 입력해주세요 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1:
					//고객 메뉴
					c.customerMenu();
					break;
				case 2:
					//관리자 메뉴 로그인
					a.adminLoginMenu();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("[잘못 입력하셨습니다. 다시 입력해주세요.]");
					break;
			}
		}
	}
}