package com.kh.javai;
import java.util.Scanner;

// pos의 전체적인 관리를 위한 class  //++디자인 패턴에서 싱글톤은 하나의 객체로 돌려서 사용
public class POSSystem {
	// 외부에서 접근이 불가능한 pos객체생성
	private final static Customer[] CUSTOMER_LIST = new Customer[10];
	private static POSSystem posinstance = new POSSystem();
	Scanner sc = new Scanner(System.in);
	//외부에서 생성할 수 없도록 기본생성자의접근을 private으로 설정
	private POSSystem() {
		
	}
	
	public static POSSystem getPosInstance() {
		//POSSystme내부에 있는 매서드 영역이므로 private한 posInstance에
		//접근이 가능하다.
		return posinstance;
	}
	
	//pos 메뉴를 나타내주는 매서드
	public int printMenu() {
		System.out.println("--------------");
		System.out.println("1. 회원등록 ");
		System.out.println("2. 회원삭제 ");
		System.out.println("3. 회원목록출력 ");
		System.out.println("4. 로그인");
		System.out.println("--------------");
		System.out.println("원하시는 번호를 입력해주세요. (이외번호를 입력하시면 프로그램을 종료합니다.)");
		return sc.nextInt();
	}
	
	//회원가입 정보입력받아 배열에 저장하는 매서드
	public void joinCustomer() {
		if (this.CUSTOMER_LIST[this.CUSTOMER_LIST.length - 1] != null) {
			System.out.print("더이상 회원을 등록할 수 없습니다.");
			return;
		}
		Customer newUser = insertCustomer();
		saveCustomer(newUser);
	}
	
	//맨 마지막으로 추가된 회원을 삭제한다.
	public void deleteLastCustomer() {
		for(int i = this.CUSTOMER_LIST.length - 1; i >= 0; i--) {
			if (this.CUSTOMER_LIST[i] != null) {
				System.out.print(this.CUSTOMER_LIST[i].getName()+"회원정보를 삭제하였습니다.");
				this.CUSTOMER_LIST[i] = null;
				break;
			}
		}
	}
	
	//회원가입 정보입력을 위한 매서드
	public Customer insertCustomer() {
		String id, pass, name, email;
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("아이디 : ");
		id = sc.next();
		
		System.out.print("비밀번호 : ");
		pass = sc.next();
		
		System.out.print("이메일: ");
		email = sc.next();
		Customer tmp = new Customer(name, id, pass, email);
		return tmp;
	}
	
	//회원을 실제로 배열에 저장하는 매서드
	public void saveCustomer(Customer user) {
		for(int i = 0; i < CUSTOMER_LIST.length; i++) {
			if(CUSTOMER_LIST[i] == null) {	
				CUSTOMER_LIST[i] = user;
				
				System.out.println(this.CUSTOMER_LIST[i].toString());
				System.out.println("회원정보가 정상적으로 등록되었습니다.");
				break;
			} 
		}
	}
	
	//회원목록을 출력해주는 매서드
	public void viewCustomerList() {
		System.out.println("이름\t아이디\t비밀번호\t이메일");
		for(int i = 0; i <this.CUSTOMER_LIST.length; i++) {
			if(this.CUSTOMER_LIST[i] == null) {
				break;
			}
			System.out.println(this.CUSTOMER_LIST[i].toString());
		}
	}
	
	//로그인 매서드
	public void login() {
		Customer loginCustomer;
		
		String id,pass;
		
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		pass = sc.next();
		
		for(int i = 0 ;i < this.CUSTOMER_LIST.length; i++) {
			if(this.CUSTOMER_LIST[i] == null) {
				System.out.println("등록된 회원정보를 찾을 수 없습니다.");
				break;
			} else if(this.CUSTOMER_LIST[i].equals(id, pass)) {
				loginCustomer = this.CUSTOMER_LIST[i];
				System.out.println("로그인 성공.");
				break;
			} else if(this.CUSTOMER_LIST[i].idCheck(id)){
				System.out.println("비밀번호가 틀렸습니다.");
				break;
			} else if(i == this.CUSTOMER_LIST.length - 1) {
				System.out.println("등록된 회원정보를 찾을 수 없습니다.");
			}
		}
	}
}
