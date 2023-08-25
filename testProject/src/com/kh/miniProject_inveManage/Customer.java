package com.kh.miniProject_inveManage;
import java.util.*;

import com.kh.iclass.Product;
public class Customer {
	
	Scanner sc = new Scanner(System.in);
	public void Customer() {
		
	}
	
	public void customerMenu() {
		while(true) {
			int cMNum;
			System.out.println("====== 고객 메뉴 ======");
			System.out.println("1. 전체 상품 목록");
			System.out.println("2. 상품 조회");
			System.out.println("3. 상품 구매");
			System.out.println("4. 뒤로 가기");
			System.out.print("번호를 입력해주세요 : ");
			cMNum = sc.nextInt();
			
			switch(cMNum) {
			case 1:
				System.out.println("상품명\t가격\t수량\t설명");
				break;
			case 2:
				// 상품 조회 (?)
				break;
			case 3:
				// 상품 구매 (상품명 갯수)
				break;
			case 4:
				System.out.println("Main으로 이동합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
}
