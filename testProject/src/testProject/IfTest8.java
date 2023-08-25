//		if (num >= 100) {
//			System.out.println("3자리 수 이상입니다.");
//		} else {
//			System.out.println("3자리 수 이하입니다.");
//		}
		
//		if (num > 0) {
//			System.out.println("양수다");
//		} else if (num == 0) {
//			System.out.println("0이다");
//		}
//		else {
//			System.out.println("양수가 아니다");
//		}
		
//		if (num % 2 == 0) {
//			System.out.println("짝수다");
//		} else {
//			System.out.println("홀수다");
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("인원 수 : ");
//		int people = sc.nextInt();
//		System.out.print("사탕 개수 : ");
//		int candy = sc.nextInt();
//		
//		int peo_1 = candy / people;
//		int le = candy % people;
//		
//		System.out.println("1인당 사탕 개수 : "+peo_1);
//		System.out.println("남는 사탕 개수 : "+le);
//		char gender;
//		String name;
//		int grade, cla, number;
//		float rec;
//		
//		System.out.print("이름 : ");
//		name = sc.next();
//		
//		System.out.print("학년(숫자만) : ");
//		grade = sc.nextInt();
//		
//		System.out.print("반(숫자만) : ");
//		cla = sc.nextInt();
//		
//		System.out.print("번호(숫자만) : ");
//		number = sc.nextInt();
//		
//		System.out.print("성별(M/F) : ");
//		gender = sc.next().charAt(0);
//		
//		if (gender == 'M') {
//			gender = '남';
//		}
//		 else {
//			gender = '여';
//		 }
//		
//		System.out.print("성적(소수점 아래 둘째자리까지) : ");
//		rec = sc.nextFloat();
//		
//		System.out.print(grade+"학년 "+cla+"반 "+number+"번 "+name+" "+gender +"학생의 성적은 "+rec+"이다.");

//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		String grade;
//		if (age <= 13) {
//			grade = "어린이";
//		} else if (age > 13 && age <=19) {
//			grade = "청소년";
//		} else {
//			grade = "성인";
//		}
//		System.out.println();
//		System.out.println(age2);
		
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		
//		String grade = age <= 13 ? "어린이" : age <19 ? "청소년": "성인";
//		
//		System.out.println(grade);

//		int kor, eng, math, sum;
//		String pass;
//		
//		System.out.print("국어 : ");
//		kor = sc.nextInt();
//		System.out.print("영어 : ");
//		eng = sc.nextInt();
//		System.out.print("수학 : ");
//		math = sc.nextInt();
//		
//		sum= kor+eng+math;
//		
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + (float) (sum/3));
//		
//		if (kor >= 40 && eng >= 40 && math >= 40 && sum/3 >=60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}

//		System.out.print("주민번호를 입력하세요(- 포함) : ");
//		
//		String rrn = sc.next();
//		char rrnG = rrn.charAt(7);
//		
//		if (rrnG%2==0) {
//			System.out.println("여자");
//		} else {
//			System.out.println("남자");
//		}

package testProject;
import java.util.*;

public class IfTest8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a, b, c;
		System.out.print("A사원의 연봉 : ");
		a = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		b = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		c = sc.nextInt();
		
		float a_incentive = (float)(a*1.4);
		float b_incentive = (float)(b);
		double c_incentive = (double)(c*1.15);

	    System.out.println("A사원 연봉/연봉+a : " + a + "/" + a_incentive + "\n3000 " + (a_incentive > 3000 ? "이상" : "미만"));
	    System.out.println("B사원 연봉/연봉+a : " + b + "/" + b_incentive + "\n3000 " + (b_incentive > 3000 ? "이상" : "미만"));
	    System.out.println("C사원 연봉/연봉+a : " + c + "/" + c_incentive + "\n3000 " + (c_incentive > 3000 ? "이상" : "미만"));
	}
}
