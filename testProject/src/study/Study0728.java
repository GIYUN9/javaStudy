//		do { System.out.print("1이상의 숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		if(num<=0) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//			}
//		} while (num<=0); 
//			for(int i = 1; i<=num; i++) {
//				System.out.print(i+" ");
//			}

//		Scanner sc = new Scanner(System.in);
//		
//		int num, sum=0;
//		
//		System.out.print("정수를 하나 입력하세요 : ");
//		num = sc.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			sum += i;
//			
//			if(i == num) {
//				System.out.print(i + " = " + sum);
//			} else {
//				System.out.print(i+ " + ");
//			}
//		}

//		int[] ar = new int[3];
//		
//		ar[0] = 7;
//		ar[1] = 8;
//		ar[2] = 9;
//		
//		int num = ar[0]+ar[1]+ar[2];
//		System.out.print(num);

//		int dan;
//		System.out.print("숫자 : ");
//		dan = sc.nextInt();
//
//		if(dan<10){ 
//		for (int j = dan; j<=9; j++) {
//				System.out.println("===== " + j + "단 =====");			
//			for(int i = 1; i<=9; i++) {
//				System.out.println(j + " * " + i + " = " + (j * i));
//					}
//				}
//		} else {
//			System.out.println("9 이하의 숫자만 입력해주세요.");
//		}

//		int num, tol;
//		System.out.print("시작 숫자 : ");
//		num = sc.nextInt();
//		System.out.print("공차 : ");
//		tol = sc.nextInt();
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.print(num + " ");
//			num += tol;
//			
//		}
//		int num1, num2;
//		String carc;
//		
//		while(true) {
//			System.out.print("연산자(+, -, *, /, %) : ");
//			carc=sc.next();
//			
//			if(carc.equals("exit")) {
//				System.out.print("프로그램을 종료합니다.");
//				break;
//			}
//				System.out.print("정수1 : ");
//				num1 = sc.nextInt();
//	
//				System.out.print("정수2 : ");
//				num2 = sc.nextInt();
//			
//			switch(carc) {
//			case "+":
//				System.out.println(num1+" + "+num2+" = "+(num1+num2));
//				break;
//			case "-":
//				System.out.println(num1+" - "+num2+" = "+(num1-num2));
//				break;
//			case "*":
//				System.out.println(num1+" * "+num2+" = "+(num1*num2));
//				break;
//			case "/":			
//				if(num2==0) {
//					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//				}else {
//					System.out.println(num1+" / "+num2+" = "+(num1/num2));
//				}
//				break;
//			case "%":
//				System.out.println(num1+" % "+num2+" = "+(num1%num2));
//				break;
//			default:
//				System.out.println("없는 연산자입니다. 다시입력해주세요.");
//				}
//		}

//		int num;
//		
//		System.out.print("정수 입력 : ");
//		num = sc.nextInt();
//		
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		int num;
//		do { System.out.print("정수 : ");
//		num = sc.nextInt();
//			if(num<1) {
//				System.out.println("양수가 아닙니다");
//			}
//		}while(num<1);
//		
//		 {
//		if(num>0) {
//			for(int i = 1 ; i <= num; i++) {
//				System.out.print((i%2==1) ? "박":"수");
//			}
//		}
//		}

package study;
import java.util.*;

	/*array
	 * 자료형[] 배열이름; // 배열의 선언
	 * 배열이름 = new 자료형[길이]; // 배열의 메모리 생성
	 */

public class Study0728 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int random, num, count = 0;
		System.out.print("난수를 입력하세요 : ");
		random = sc.nextInt();
		
		
		do {System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			num = sc.nextInt();
		if (num < 1 || num > 100) {
			System.out.println("1~100 사이의 숫자를 입력해주세요.");
		} else {
			++count;
			if (num > random) {
					System.out.println("DOWN !");
				}else if(num == random) {
					System.out.println("정답입니다 !! \n" + count + "회만에 맞추셨습니다.");
				}else if(num < random && num != 0){
					System.out.println("UP !");
				}
			}
		} while(num != random);
		
		
}
}