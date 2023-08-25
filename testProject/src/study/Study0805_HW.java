package study;
import java.util.*;
import java.math.*;

public class Study0805_HW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// 1
//		/* 정수하나를 입력받아 5이상의 숫자를 입력하였는지 확인하고
//		* 5이상을 입력하였다면 1부터 해당수까지 순차적으로 출력하는 프로그램을 만들어라
//		*/
//		int num;
//		do {System.out.print("5이상의 정수 : ");
//		num = sc.nextInt();
//			if(num<5) {
//				System.out.println("5이상의 정수를 입력하세요.");
//			}else {
//				for(int i = 1; i <= num; i++) {
//					System.out.print(i + " ");
//					}
//			}
//		}while(num<5);
//		System.out.println();
//		// 2
//		/* 정수 n을 입력받아 길이가 n인 1차원배열을 만들어라 
//		* 해당배열에 1~n까지의 수를 차례대로 할당하고 이를 출력하는 프로그램을 작성해라
//		*/
//		int n;
//		int number = 1;
//		System.out.print("정수 : ");
//		n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = number++;
//			System.out.print(arr[i] + " ");
//			}
//		System.out.println();
		
		Menu admin = new Menu("콜라" , 4000);
		admin.inStock(10);
		admin.inventory();
		admin.getName();
		
	}

}
