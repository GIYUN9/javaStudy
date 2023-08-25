package com.kh.OOP3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		try {
			Scanner kb = new Scanner(System.in);
			
			System.out.print("a/b...a?");
			int n1 = kb.nextInt();
			
			System.out.print("a/b...a?");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
		} 
		catch(ArithmeticException | InputMismatchException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Good bye~~!");
		}

	}

}
