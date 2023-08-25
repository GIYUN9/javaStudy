package com.kh.javai;

public class Student {
	// 필드(데이터 집합)
	public static int count = 0;
	public String name; // 이름
	private int age; // 나이
	private String gender; // 성별
	private int mathScore; // 수학점수
	private int engScore; // 영어점수
	private int korScore; // 국어점수
	
	// 생성자
	// 인스턴스 객체를 생성할 때 데이터를 초기화하기 위해
	// 자동으로 한번만 실행하는 특별한 메서드
	// 메서드처럼 접근해서 실행할 수 없으며 class의 이름과 동일한 이름을 가진다.
	// 초기화를 위한 메서드이기 때문에 반환값은 없다.
	/* 기본생성자
	 * 생성자를 아무것도 작성하지 않았을 때
	 * 컴파일러가 기본적으로 생성해주는 생성자
	 * (아무 기능이 없다.)
	 * public Student(){}
	 */
	public Student(){
		System.out.println("student의 기본생성자");
	}
	//생성자는 여러개 생성이 가능하다.
	//생성자가 여러개일때는 매개변수를 통해서 식별한다
	//애매한 생성자는 사용은 지양한다.
	public Student(String tName){
		System.out.println("tName을 매개변수로 받는 생성자");
	}
	public Student(String tName, int tAge){
		System.out.println("tName, tAge를 매게변수로 받는 생성자");
	}
	public Student(String tName, int tAge, String tGender){
		count++;
		name = tName;
		age = tAge;
		gender = tGender;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("학생이 추가되었습니다.");
	}
	
	// 메서드(기능 집합)
	// info메서드 생성
	// 저는 oo살의 상oo ooo입니다. 
	public void info() {
		System.out.println(name + "\t" + age + "\t" + gender);
	}
	
	// set메서드(setter) => 필드데이터에 값을 저장하기 위한 메서드
	public void setEngScore(int tEngScore) {
		if(tEngScore < 0) {
			engScore = 0;
			return;
		}
		engScore = tEngScore;
	}
	public void setKorScore(int tKorScore) {
		if(tKorScore < 0) {
			korScore = 0;
			return;
		}
		korScore = tKorScore;
	}
	public void setMathScore(int tMathScore) {
		if(tMathScore < 0) {
			mathScore = 0;
			return;
		}
		mathScore = tMathScore;
	}
	
	//get메서드(getter) => 필드데이터에 값을 사용하기 위한 메서드
	public int getEngScore() {
		return engScore;
	}
	public int getKorScore() {
		return korScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public String getGender() {
		return this.gender;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	// 기능을 담당하는 메서드
	// 토탈값을 반환하는 메서드
	public int getTotal() {
		int total =(engScore+korScore+mathScore);
		return total;
	}
	public float getAvg() {
		float avg = getTotal()/3; 
		return avg;
	}
	public boolean checkPass() {
		if(getAvg()>=60 && getEngScore() >= 40 && getKorScore() >= 40 && getMathScore() >=40) {
			return true;
		}else {
			return false;
		}
	}
	//dispalyMyInfo 메서드를 만들어보자
	//매개변수는 없고
	//리턴값도 존재하지않는다.
	// 실행의 결과로
	//저는 00살의 000입니다.
	//국어 : 00점
	//영어 : 00점
	//수학 : 00점
	//합계 : 00점
	//평균 : 00점
	//으로 시험에 합격하였습니다.
	public void dispalyMyInfo() {
		System.out.println("저는 "+age+"살의 "+name+"입니다");
		System.out.println("영어 : " + getEngScore()+"점");
		System.out.println("국어 : " + getKorScore()+"점");
		System.out.println("수학 : " + getMathScore()+"점");
		System.out.println("총 합 : " + getTotal()+"점");
		System.out.println("평균 : " + getAvg()+"점");
		System.out.println("으로 시험에 "+(checkPass() ? "합격":"불합격")+"하였습니다");
	}
	// 매게변수 값과 객체의 데이터가 동일 하다면 true, 아니면 false
	public boolean equals(String name, int age, String gender) {
		if(this.name.equals(name) && this.age == age && this.gender.equals(gender)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void showCount() {
		System.out.print(count);		
	}
}
