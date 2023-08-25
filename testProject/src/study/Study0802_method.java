//	public static void main(String[] args) {
//		System.out.println("프로그램의 시작");
//		hiEveryone(12);
//		hiEveryone(13);
//		System.out.println("프로그램의 끝");
//	}
//
//	
//	public static void hiEveryone(int age/*매개 변수*/) {
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 "+ age +"세 입니다.");
//		
//	}
//==========================================================
//	public static void main(String[] args) {
//		double myHeight = 175.9;
//		hiEveryone(12, 12.5);
//		hiEveryone(12, myHeight);
//		hiEveryone();
//	}
//
//	
//	public static void hiEveryone(int age, double height) {
//		System.out.println("제 나이는 "+ age +"세 입니다.");
//		System.out.println("저의 키는 " + height + "cm 입니다.");
//	}
//	
//	public static void hiEveryone() {
//		System.out.println("다음에 뵙겠습니다.");		
//	}
//============================================================
//	public static void main(String[] args) {
//		int result;
//		result = adder(4, 5);
//		System.out.println("4 + 5 = " + result);
//		System.out.println("3.5 x 3.5 = " + square(3.5));
//	}
//
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult;
//	}
//	
//	public static double square(double num) {
//		return num * num; 
//	}
//=============================================
//	
//	public static void main(String[] args) {
//		System.out.print(factorial(3));
//	}
//	
//	public static int factorial(int n) {
//		if(n == 1) {
//			return 1;
//		}else {
//			return n * factorial(n-1);
//		}
//	}
//	====================================================
//		BankAccount yoon = new BankAccount();
//		BankAccount park = new BankAccount();
//		
//		BankAccount tmp;
//		String s ="hi";
//		String t ="hi";
//		System.out.println(yoon.balance);
//		System.out.println(park.balance);
//		
//		yoon.deposit(1000);
//		park.deposit(2000);
//		
//		서로의 주소값을 변경하여 서로의 클래스 참조 
//		비어 있는 객채 tmp 생성 후 주소를 임시 저정하고 서로 변경하여 초기화
//		tmp = yoon;
//		yoon = park;
//		park = tmp; 
//		tmp = null;
//		
//		yoon.checkMyBalance();
//		park.checkMyBalance();
//		check(yoon);
package study;
import java.util.*;
import java.math.*;

public class Study0802_method {

	public static void main(String[] args) {
		
		BankAccount na1 = new BankAccount();
		na1.checkMyBalance();
		BankAccount na2 = new BankAccount(30000, "giyun");
		na2.checkMyBalance();
	}
//	public static void check(BankAccount acc) {
//		acc.checkMyBalance();
//	}
}
class BankAccount{
	int balance;
	String name;
	
	public BankAccount() {
		balance = 0;
		name = "이름없음";
	}
	public BankAccount(int b, String n) {
		balance = b;
		name = n;
	}
	
//	public int deposit(int amount) {
//		balance += amount;
//		return balance;
//	}
//	public int withdraw(int amount) {
//		balance -= amount;
//		return balance;
//	}
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		System.out.println("이름 : " + name);
		return balance;
	}
	
}





