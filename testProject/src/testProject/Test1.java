package testProject;
import java.util.*; // "*" 전체

public class Test1 {

	public static void main(String[] args) {
		//1. 변수 개수 체크
		//2. 내가 할 수 있는 출력 해보기
		//3.입력받아할 곳에 넣고
		//4. 입력받은 값을 활용해서 출력
		String name, gen;
		int age;
		float he;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		gen = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		he = sc.nextFloat();
		
		System.out.print("키 " + he + "cm인" + age + "살 " + gen + "자 " + name + "님 반갑습니다 ^^");
	}

}
