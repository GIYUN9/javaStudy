package com.kh.miniProject_inveManage_stop;
import java.util.*;
public class Customer {
	Scanner sc = new Scanner(System.in);
	Product p = new Product();
	ProductController pc = new ProductController();
	
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
				List<Product> products = ProductController.getProducts();
				System.out.println("상품명\t가격\t수량\t설명");
				for (Product product : products) {
		            System.out.println(product.getName()+"\t"+product.getPrice()+"\t"
		            		+product.getAmount()+"\t"+product.getDescription());
		          }
				break;
			case 2:
				System.out.println("조회하실 상품의 이름을 입력해주세요 : ");
		          String productName = sc.next();
		          Product product = ProductController.getProductByName(productName);
		          if (product != null) {
		        	  System.out.println("상품명\t가격\t수량\t설명");
		        	  System.out.println(product.getName()+"\t"+product.getPrice()+"\t"
			            		+product.getAmount()+"\t"+product.getDescription());
		          } else {
		            System.out.println("조회하신 상품이 없습니다.");
		          }
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
