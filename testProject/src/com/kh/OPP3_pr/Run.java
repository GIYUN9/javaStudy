package com.kh.OPP3_pr;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// int 형 변수 num을 입력받으세요
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// num이 홀수 이면 홀수입니다. 짝수면 짝수입니다를 출력
		if(num%2==0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		System.out.println();
		// 1부터 num까지 모두 더한 합을 구해서 출력
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		// num크기의 int형 배열을 만들고 0~(num-1)까지의 인덱스에 1~num까지의 숫자를 저장하고
		// 모든 배열에 저장이 잘되었는지 출력
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// Animal 추상클레스 작성
		// 필드 값 : String name, int age
		// 필드를 초기화 하는 생성자 생성
		// 추상메서드 makeSound : 매개변수와 리턴값이 없음
		
		
		// 인터페이스 Swimmable 작성
		// 추상메서드 swim : : 매개변수와 리턴값이 없음
		
		// 인터페이스 Flyable 작성
		// 추상메서드 fly : : 매개변수와 리턴값이 없음
		
		// Bird 클레스 작성
		// Animal을 상속받고, Flyable을 구현
		// fly메서드에서는 "oo는 하늘을 날아다닌다"출력
		
		// fish클레스 작성
		// Animal을 상속받고, Swimmable를 구현
		// swim메서드에서는 "oo는 물을 헤험친다"출력
		
		// 메인문에서 각각객체를 하나 만들고 테스트 실행

		Bird b = new Bird("참새", 2);
		b.fly();
		b.makeSound();
		
		Fish f = new Fish("금붕어", 1);
		f.swim();
		f.makeSound();
		
		Animal a = new Bird("참새2", 22);
		((Flyable)a).fly();
		a.makeSound();
		
		Animal a2 = new Fish("금붕어2", 33);
		((Fish)a2).swim();
		a2.makeSound();
		
	}

}
