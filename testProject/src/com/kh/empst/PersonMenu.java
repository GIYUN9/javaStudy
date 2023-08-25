package com.kh.empst;
import java.util.*;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		boolean isTrue = true;
			while(isTrue) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 "+pc.personCount()[0]+"명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 "+pc.personCount()[1]+"명입니다.");
			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int insNum = sc.nextInt();
			
			switch (insNum) {
				case 1:
					studentMenu();
					break;
				case 2:
					employeeMenu();
					break;
				case 9:
					System.out.println("종료합니다.");
					isTrue = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
			}
			
		}
	}
	
	public void studentMenu() {
		boolean isSMTrue = true;
		while(isSMTrue) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			int smi = sc.nextInt();
			
			switch (smi) {
				case 1:
					insertStudent();
					break;
				case 2:
					printStudent();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					isSMTrue = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				
				}
			}
	}
	
	public void employeeMenu() {
		boolean isSMTrue = true;
		while(isSMTrue) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			int smi = sc.nextInt();
			
			switch (smi) {
				case 1:
					insertEmployee();
				break;
				case 2:
					printEmployee();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					isSMTrue = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				
				}
			}
	}
	
	public void insertStudent() {
		if(pc.personCount()[0]!=3) { //학생의 데이터 수가 3명이 아니라면
			System.out.print("학생 이름 : ");
			String iName = sc.next();
			System.out.print("학생 나이 : ");
			int iAge = sc.nextInt();
			System.out.print("학생 키 : ");
			double iHe = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double iWe = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int iGr = sc.nextInt();
			System.out.print("학생 전공 : ");
			String iMa = sc.next();
			
			pc.insertStudent(iName, iAge, iHe, iWe, iGr, iMa);
		} else if(pc.personCount()[0]==3) { //학생의 데이터 수가 3명이라면
			System.out.println("학생을 담을 수 있는 공간이 꽉찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		}
	}
	public void printStudent() {
		System.out.println(pc.printStudent());
	}
	
	public void insertEmployee() {
			if(pc.personCount()[1]!=10) {//사원의 데이터 수가 10명이 아니라면
				System.out.print("사원 이름 : ");
				String iName = sc.next();
				System.out.print("사원 나이 : ");
				int iAge = sc.nextInt();
				System.out.print("사원 키 : ");
				double iHe = sc.nextDouble();
				System.out.print("사원 몸무게 : ");
				double iWe = sc.nextDouble();
				System.out.print("사원 급여 : ");
				int iSa = sc.nextInt();
				System.out.print("사원 부서 : ");
				String iDe = sc.next();
				
				pc.insertEmployee(iName, iAge, iHe, iWe, iSa, iDe);
			} else if(pc.personCount()[1]==10) {//사원의 데이터 수가 10명이라면
				System.out.println("사원을 담을 수 있는 공간이 꽉찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
	}
	public void printEmployee() {
		System.out.println(pc.printEmployee());
	}
	
}
