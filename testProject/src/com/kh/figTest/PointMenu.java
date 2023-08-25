package com.kh.figTest;
import java.util.*;

public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	private boolean isTrue = true;
	
	public void mainMenu() {
		while(isTrue) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			if(num == 1) {
				circleMenu();
			} else if(num == 2) {
				rectangleMenu();
			} else if(num == 9) {
				System.out.println("종료합니다.");
				isTrue = false;
				break;
			}
		}
		
	}
	public void circleMenu(){
		while(true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			if(num == 1) {
				calcCircum();
				mainMenu();
			} else if(num == 2) {
				calcCricleArea();
				mainMenu();
			} else if(num == 9) {
				System.out.println("메인으로 이동합니다.");
				mainMenu();
			}break;
		}
	}
	public void rectangleMenu() {
		while(true) {
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			if(num == 1) {
				calcPerimeter();
				mainMenu();
			} else if(num == 2) {
				calcRectArea();
				mainMenu();
			} else if(num == 9) {
				System.out.println("메인으로 이동합니다.");
				mainMenu();				
			}break;
		}
	}
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int xn = sc.nextInt();
		System.out.print("y 좌표 : ");
		int yn = sc.nextInt();
		System.out.print("반지름 : ");
		int radi = sc.nextInt();
		System.out.println(cc.calcCircum(xn, yn, radi));
	}
	public void calcCricleArea() {
		System.out.print("x 좌표 : ");
		int xn = sc.nextInt();
		System.out.print("y 좌표 : ");
		int yn = sc.nextInt();
		System.out.print("반지름 : ");
		int radi = sc.nextInt();
		System.out.println(cc.calcArea(xn, yn, radi));
	}
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int xn = sc.nextInt();
		System.out.print("y 좌표 : ");
		int yn = sc.nextInt();
		System.out.print("높이 : ");
		int hi = sc.nextInt();
		System.out.print("너비 : ");
		int wi = sc.nextInt();
		System.out.println(rc.calcPerimeter(xn, yn, hi, wi));
		
	}
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int xn = sc.nextInt();
		System.out.print("y 좌표 : ");
		int yn = sc.nextInt();
		System.out.print("높이 : ");
		int hi = sc.nextInt();
		System.out.print("너비 : ");
		int wi = sc.nextInt();
		System.out.println(rc.calcArea(xn, yn, hi, wi));
		
	}
}
