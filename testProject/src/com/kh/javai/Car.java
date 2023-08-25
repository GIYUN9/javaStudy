package com.kh.javai;

public class Car {
	
	String color; // 색상
	String company; //제조회사
	String type; // 타입(준준형, 중형, 대형, 스포츠카)
	String engine; // 엔진(가솔린, 디젤, 하이브리드, 가스, 전기, 수소)
	String date; // ex) 2023-08-04
	int maxSpeed; // 최대속도
	int zero100; // 제로백
	int speed; // 현재 속도
	int maxCc; // 최대 주유량
	int cc; //주유량
	
	//색상, 제조회사, 타입, 엔진, 제조날짜를 넘겨받아 초기화하는 생성자를 생성, zero100, maxCc
	//나머지 값들은 알맞는 방식으로 초기화
	public Car() {
		
	}
	public Car(String color, String company, String type, String engine, 
			String date, int maxSpeed, int zero100, int maxCc) {
		this.color = color;
		this.company = company;
		this.type = type;
		this.engine = engine;
		this.date = date;
		this.maxSpeed = maxSpeed;
		this.zero100 = zero100;
		this.maxCc = maxCc;
		this.cc = 50;
		this.speed = 0;
		
		
	}
	
	//axel, break, insertCc,
	//onAxel 메서드를 호출하면 speed+5 하고 속도 리턴
	//최대 속도 일때는 고정
	public int onAxel() {	
		if ((speed + 5) >= maxSpeed) {
			speed = maxSpeed;
		}else {
			speed += 5;
		}
		cc-=3;
		return speed;
	}
	//onBreak 메서드를 호출하면 speed-5 하고 속도 리턴
	//최저 속도는 0
	public int onBreak() {
		if ((speed - 5) <= 0) {
			speed = 0;
		}else {
			speed -= 5;
		}
		if(speed != 0) {
			cc-=1;
		}
		return speed;
	}
	// 넣은 기름만큼 추가 남은양 반환
	public int insertCc(int plusCc) {
		if (cc + plusCc > maxCc) {
			int tmpCc = (cc + plusCc - maxCc);
			cc = maxCc;
			return tmpCc;
		}else {
			cc += plusCc;
			return 0;
		}
	}
	
	//statusDisplay 차량상태 확인
	public void statusDisplay(int type) {
		switch(type) {
			case 1: {
				System.out.println("색상 : " + this.color);
				System.out.println("제조사 : " + this.company);
				System.out.println("타입 : " + this.type);
				System.out.println("엔진 : " + this.engine);
				System.out.println("출고 날짜 : " + this.date);
				System.out.println("최대속도 : " + this.maxSpeed + "KM");
				System.out.println("제로백 : " + this.zero100 + "초");
				System.out.println("최대 주유량 : "+ this.maxCc);
			}break;
			case 2: {
				System.out.println("속도 : " + this.speed);
				System.out.println("잔여 기름 : " + this.cc);
			}
		}
	}
	public void stop() {
		if(this.cc == 0) {
			System.out.println("연료가 없습니다");
		}
	}
	
}
