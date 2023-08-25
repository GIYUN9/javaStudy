package com.kh.miniProject_inveManage_stop;
import java.util.*;

public class Admin {
	ProductController pc = new ProductController();
	Scanner sc = new Scanner(System.in);
	private static final String ADMIN_ID = "2"; 
	private static final String ADMIN_PSW = "2"; 
	String adLoginId;
	String adLoginPsw;
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
					System.out.println("상품 추가를 선택하셨습니다.");
					System.out.print("상품의 이름을 입력하세요: ");
					String name = sc.next();
					System.out.print("상품의 가격을 입력하세요: ");
					int price = sc.nextInt();
					System.out.print("상품의 수량을 입력하세요: ");
					int amount = sc.nextInt();
					System.out.print("상품의 설명을 입력하세요: ");
					String description = sc.next();
					
					Product product = new Product(name, price, amount, description);
					pc.addProduct(product);
					System.out.println("상품이 추가되었습니다.");
					break;
				case 2:
					System.out.println("=== 상품 삭제 ===");
					System.out.println("삭제할 상품명을 입력하세요: ");
					String delName = sc.next();

					Product delproduct = ProductController.getProductByName(delName);
					if (delproduct != null) {
					  pc.deleteProduct(delproduct.getName());
					  System.out.println("상품이 삭제되었습니다.");
					} else {
					  System.out.println("삭제할 상품이 없습니다.");
					}
					break;
				case 3:
					// 상품 수정
					break;
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
