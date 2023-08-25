package com.kh.fig;
import java.util.*;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();

	
	public void inputMenu() {
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 3:{
					triangleMenu();
				}break;				
				case 4:{
					squareMenu();
				}break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					isTrue = false;
					break;
				default:
					System.out.print("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
		
	}
	
	public void triangleMenu() {
		while(true) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			switch(menuNum) {
				case 1:{
					inputSize(3, menuNum);
				}break;				
				case 2:{
					inputSize(3, menuNum);
				}break;
				case 3:{
					printinformation(3);
				}break;
				case 9:{
					System.out.println("메인으로 돌아갑니다.");
					inputMenu();
				}break;
				default:
					System.out.print("잘못된 번호입니다. 다시 입력하세요.");
					
			}
		}
	}
	
	public void squareMenu() {
		while(true) {
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			
			int menuNum = sc.nextInt();
			switch(menuNum) {
				case 1:{
					inputSize(4, menuNum);
				}break;				
				case 2:{
					inputSize(4, menuNum);
				}break;
				case 3:{
					inputSize(4, menuNum);
				}break;
				case 4:{
					printinformation(4);
				}break;
				case 9:{
					System.out.println("메인으로 돌아갑니다.");
					inputMenu();
				}break;
				default:
					System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void inputSize(int type, int menuNum) {
		if(type==3) {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				double he = sc.nextDouble();
				System.out.print("너비 : ");
				double wi = sc.nextDouble();
				double area = tc.calcArea(he, wi);
				System.out.println("삼각형 면적 : "+ area);
			} else if (menuNum == 2) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
		} else if(type==4) {
			if (menuNum == 1) {
				System.out.print("높이 : ");
				double he = sc.nextDouble();
				System.out.print("너비 : ");
				double wi = sc.nextDouble();
				double per = scr.calcPerimeter(he, wi);
				System.out.println("사각형 둘레 : "+ per);
			}else if(menuNum == 2) {
				System.out.print("높이 : ");
				double he = sc.nextDouble();
				System.out.print("너비 : ");
				double wi = sc.nextDouble();
				double per = scr.calcArea(he, wi);
				System.out.println("사각형 면적 : "+ per);
			} else if(menuNum == 3) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
			
			
		}
		
	}
	
	public void printinformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		}else if(type == 4) {
			System.out.println(scr.print());
		}
	}
	public static void main(String[] args) {
		ShapeMenu shapeMenu = new ShapeMenu();
		shapeMenu.inputMenu();
	}
}
