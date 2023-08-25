package com.kh.miniProject_inveManage;
import java.util.*;

public class Admin {
	Scanner sc = new Scanner(System.in);
	private static final String ADMIN_ID = "2"; 
	private static final String ADMIN_PSW = "2"; 
	String adLoginId;
	String adLoginPsw;
	ProductController pc = new ProductController();
	
	public Admin() {
		
	}
	public void adminLoginMenu() {
		while(true) {
			System.out.println("====== 관리자 로그인 ======");
			System.out.print("아이디 : ");
			adLoginId = sc.nextLine();
			System.out.print("비밀번호 : ");
			adLoginPsw = sc.nextLine();
			
			if(adLoginId.equals(ADMIN_ID)) {
				if(adLoginPsw.equals(ADMIN_PSW)) {
					System.out.println("[로그인 성공]");
					adminMenu();
					return;
				}else {
					System.out.println("아이디 또는 비빌번호가 잘못되었습니다.");
				}
			}else {
				System.out.println("존재하지 않는 아이디 또는 비빌번호가 잘못되었습니다.");
			}
		}
	}
	
	public void adminMenu() {
		boolean isTrue = true;
		while(isTrue) {
			int adMNum;
			System.out.println("====== 관리자 메뉴 ======");
			System.out.println("1. 상품 추가");
			System.out.println("2. 상품 삭제");
			System.out.println("3. 상품 수정");
			System.out.println("4. 로그아웃(메인으로)");
			System.out.print("번호를 입력해주세요 : ");
			adMNum = sc.nextInt();
			
			switch(adMNum) {
				case 1:
					// 상품 추가
					System.out.println("====== 상품 추가 ======");
					System.out.print("상품명 : ");
					String name = sc.next();
					System.out.print("가격 : ");
					int price = sc.nextInt();
					System.out.print("수량 : ");
					int amount = sc.nextInt();
					System.out.print("설명 : ");
					sc.nextLine(); //?
					String des = sc.nextLine();
					pc.add(name, price, amount, des);
					break;
				case 2:
					System.out.print("상품을 삭제하시겠습니까?(y/n) : ");
					if(sc.next().charAt(0) == 'y') {
						pc.remove();
						System.out.println("삭제되었습니다.");
					} else{
						System.out.println("===취소===");
					}
					break;
				case 3:
					System.out.println("===== 수정 =====");
					System.out.println("1. 상품명");
					System.out.println("2. 가격");
					System.out.println("3. 수량");
					System.out.println("4. 설명");
					System.out.println("9. 수정하기 종료");
					System.out.print("수정 하실 항목을 선택해주세요 : ");
					int modNum = sc.nextInt();
					
					switch(modNum) {
						case 1:{
							System.out.print("상품명 재입력 : ");
							String modName = sc.next();
							pc.modifyName(modName);
							}break;
						case 2:{
							System.out.print("가격 재입력 : ");
							int modPrice = sc.nextInt();
							pc.modifyPrice(modPrice);
							}break;
						case 3:{
							System.out.print("수량 재입력 : ");
							int modAm = sc.nextInt();
							pc.modifyAmount(modAm);
							}break;
						case 4:{
							System.out.print("설명 재입력 : ");
							sc.nextLine();
							String modDes = sc.nextLine();
							pc.modifyDescription(modDes);
							}break;
						case 9:
							System.out.println("수정하기 종료");
						}break;
				case 4:
					System.out.println("[로그아웃]");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
			}
		}
	}

}
