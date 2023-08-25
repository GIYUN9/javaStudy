//		switch(day) {
//			case "월":
//			case "화":
//			case "수":
//			case "목":
//			case "금":
//				System.out.print("금일은 정상 영업합니다.");
//				break;
//			case "토":
//			case "일":
//				System.out.print("금일은 휴일입니다.");
//				break;
//			default:
//				System.out.print("잘못 입력하셨습니다.");
//		}
//		if (num == 1) {
//			System.out.println("입력 메뉴입니다.");
//		} else if (num == 2) {
//			System.out.println("수정 메뉴입니다.");
//		} else if (num == 3) {
//			System.out.println("조회 메뉴입니다.");
//		} else if (num == 4) {
//			System.out.println("삭제 메뉴입니다.");
//		} else if (num == 7) {
//			System.out.println("프로그램이 종료됩니다.");
//		}
		
//		switch(num) {
//		case 1:
//			System.out.println("입력 메뉴입니다.");
//			break;
//		case 2:
//			System.out.println("수정 메뉴입니다.");
//			break;
//		case 3:
//			System.out.println("조회 메뉴입니다.");
//			break;
//		case 4:
//			System.out.println("삭제 메뉴입니다.");
//			break;
//		case 7:
//			System.out.println("프로그램이 종료됩니다.");
//			default:
//				break;
//		}

//		int num = sc.nextInt();
//		
//		if (num < 0) {
//			System.out.println("양수만 입력해주세요.");
//		
//		} else if(num%2==1) {
//			System.out.println("홀수다");
//		} else {
//			System.out.println("짝수다");
//		}

//		int kor, math, eng, sum;
//		float avg;
//		
//		System.out.print("국어점수 : ");
//		kor = sc.nextInt();
//		System.out.print("수학점수 : ");
//		math = sc.nextInt();
//		System.out.print("영어점수 : ");
//		eng = sc.nextInt();
//		
//		sum = kor+math+eng;
//		avg = sum / (float)3;
//		if (kor >= 40 && eng >= 40 && math >= 40 && sum/3 >=60) {
//			System.out.println("국어 : "+ kor);
//			System.out.println("수학 : "+ math);
//			System.out.println("영어 : "+ eng);
//			System.out.println("합계 : "+ sum);
//			System.out.println("평균 : "+ avg);
//			System.out.println("축하합니다, 합격입니다!");
//		}else {
//			System.out.println("불합격입니다.");
//		}

//		if(my_id.equals(id) && my_psw.equals(psw)) {
//			System.out.println("로그인 성공");
//		} else {
//			if (!my_id.equals(id)) {
//				System.out.println("아이디가 틀렸습니다.");
//			}else if(!my_psw.equals(psw)) {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		}

package testProject;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		final String my_id, my_psw;
		
		my_id = "myId";
		my_psw = "myPassword12";
		
		String id, psw;
		
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		psw = sc.next();
		
		switch(id) {
			case "myId":{
				switch(psw) {
					case "myPassword12":{
						System.out.println("로그인 성공");
					}break;
					default:{
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
			}break;
			default:{
				System.out.println("아이디가 틀렸습니다.");
			}
			
		}
	}
}
