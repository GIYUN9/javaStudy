//		double m, kg, bmi;
//		
//		System.out.print("키(m)를 입력해 주세요 : ");
//		m = sc.nextDouble();
//		System.out.print("몸무게(kg)를 입력해 주세요 : ");
//		kg = sc.nextDouble();
//		
//		bmi = kg/(m*m);
//		System.out.println(bmi);
//		
//		if (bmi<18.5) {
//			System.out.println("저체중");
//		} else if(bmi >= 18.5 && bmi < 23) {
//			System.out.println("정상체중");
//		} else if(bmi >= 25 && bmi < 30) {
//			System.out.println("과체중");
//		} else if(bmi >= 30) {
//			System.out.println("고도비만");
//		}

//		int operand1, operand2;
//		char operator;
//		
//		System.out.print("피연사자1 입력 : ");
//		operand1 = sc.nextInt();
//		System.out.print("피연사자2 입력 : ");
//		operand2 = sc.nextInt();
//		System.out.print("연산자를 입력(+,-,*,/,%) : ");
//		operator = sc.next().charAt(0);
//		
//		switch (operator) {
//		 case '+':
//			 System.out.printf("%d %c %d = %.6f", operand1,operator,operand2,((double)operand1+operand2));
//			 break;
//		 case '-':
//			 System.out.printf("%d %c %d = %.6f", operand1,operator,operand2,((double)operand1-operand2));
//			 break;
//		 case '*':
//			 System.out.printf("%d %c %d = %.6f", operand1,operator,operand2,((double)operand1*operand2));
//			 break;
//		 case '/':
//			 System.out.printf("%d %c %d = %.6f", operand1,operator,operand2,((double)operand1/operand2));
//			 break;
//		 case '%':
//			 System.out.printf("%d %c %d = %.6f", operand1,operator,operand2,((double)operand1%operand2));
//			 break;
//			 default:	
//		}

//		int test1, test2, hw, att;
//		
//		System.out.print("중간 고사 점수 : ");
//		test1 = sc.nextInt();
//		System.out.print("기말 고사 점수 : ");
//		test2 = sc.nextInt();
//		System.out.print("과제 점수 : ");
//		hw = sc.nextInt();
//		System.out.print("출석 회수 : ");
//		att = sc.nextInt();
//		
//		float avg = (float) ((test1*0.2)+(test2*0.3)+(hw*0.3)+(att));
//		
//		System.out.println("========== 결과 =========="); 
//		System.out.println("중간 고사 점수(20) : "+ (test1*0.2));
//		System.out.println("기말 고사 점수(30) : "+ (test2*0.3));
//		System.out.println("과제 점수(30) : "+ (hw*0.3));
//		System.out.println("출석 회수(20) : "+ (float)att);
//		System.out.println("총점 : "+ avg);
//		
//		if (att > 20*0.7 && avg >=70) {
//			System.out.println("Pass [점수 충족]");
//		}else {
//			System.out.println("Fail [점수 미달]");
//		}

//Scanner sc = new Scanner(System.in);
//		
//		int choo;
//		
//		System.out.println("실행할 기능을 선택하세요");
//		System.out.println("1. 권한 확인");
//		System.out.println("2. BMI");
//		System.out.println("3. 계산기");
//		System.out.println("4. P/F");
//		System.out.print("선택 : ");
//		choo = sc.nextInt();
//		
//		switch (choo) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//			
//		}

//		int num = 0;
//		
//		do {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if (num < 1) {
//			System.out.println("1이상의 숫자를 입력해주세요.");
//			} else {
//				int i = 1;
//				while (i<=num) {
//					System.out.print(i+ " ");
//					i++;
//					}
//				}
//			} while (num<1);

//		int num= 0;
//		
//		while (num < 1) { // num은 1이상의 숫자가 나올때 까지 반복
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//		
//		if (num > 0) {
//			for (int i = num; i > 0; i--) {
//				System.out.print(i + " ");
//				}
//			}else {
//			System.out.println("1이상의 숫자를 입력해주세요. ");
//		}
//	}



		/*
	 	* 초기식 : 반복문을 시작할 때 한번 세팅을 위한 값
	 	* 조건식 : 매번 반복하기 전에 조건에 부합하는지 확인 후 부합하면 반복진행
	 	* 증감식 : 반복이 끝날때마다 반복문 탈출을 위해 한번 연산을 진행
	 	*/

package testProject;
import java.util.*;

public class For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int first = 0, end = 0;
		
		do {
			System.out.print("첫 번째 숫자 : ");
			first = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			end = sc.nextInt();
			if(first<=0 || end<=0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		} while(first<=0 || end<=0);
		
		
		if(first >= end && first > 0 && end > 0) {
		for(int i = end; i<=first; i++) {
			System.out.print(i + " ");
			}
		}
		else if(first <= end && first > 0 && end > 0) {
			for(int i = first; i<=end; i++) {
			System.out.print(i + " ");
			}
		}
		

	
		
}
}



