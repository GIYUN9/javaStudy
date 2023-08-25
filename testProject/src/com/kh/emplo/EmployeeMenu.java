package com.kh.emplo;
import java.util.*;
public class EmployeeMenu {
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	private boolean isTrue = true;
	public void EmployeeMenu(){
		while(isTrue) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
				case 1:
					insertEmp();
					break;
				case 2:
					updateEmp();
					break;
				case 3:
					deleteEmp();
					break;
				case 4:
					printEmp();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					isTrue = false;
					break;
				default:
					System.out.println("잘못 입력했습니다.");
					break;
			}
		}
	}
	
	public void insertEmp() {
		System.out.print("사원 번호 : ");
		int iNum = sc.nextInt();
		System.out.print("사원 이름 : ");
		String iName = sc.next();
		System.out.print("사원 성별 : ");
		char iGender = sc.next().charAt(0);
		System.out.print("전화 번호 : ");
		String iPhone = sc.next();
		ec.add(iNum, iName, iGender, iPhone);
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		char iYN = sc.next().charAt(0);
		
		if(iYN== 'y') {
			System.out.print("사원 부서 : ");
			String iDe = sc.next();
			System.out.print("사원 연봉 : ");
			int isal = sc.nextInt();
			System.out.print("보너스 율 : ");
			double iBo = sc.nextDouble();
			ec.add(iNum, iName, iGender, iPhone, iDe, isal, iBo);
			EmployeeMenu();
		} else if(iYN== 'n') {
			EmployeeMenu();
		}	
	}
	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int uNum = sc.nextInt();
		switch(uNum) {
		case 1:
			System.out.print("수정할 전화 번호 : ");
			String uN = sc.next();
			ec.modify(uN);
			break;
		case 2:
			System.out.print("수정할 사원 연봉 : ");
			int uS = sc.nextInt();
			ec.modify(uS);
			break;
		case 3:
			System.out.print("수정할 보너스 율 : ");
			double uB = sc.nextDouble();
			ec.modify(uB);
			break;
		case 9:
			System.out.println("메인메뉴로 돌아갑니다.");
			EmployeeMenu();
			break;
		default:
			break;
		}
		
	}
	public void deleteEmp() {
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char yn = sc.next().charAt(0);
		if(yn=='y')
			ec.remove();
	}
	public void printEmp() {
		System.out.println(ec.inform());
	}
	
	
}
