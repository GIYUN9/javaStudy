package testProject;
import java.util.*;


public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float kor, eng, math;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		kor = sc.nextFloat();
		System.out.print("영어 : ");
		eng = sc.nextFloat();
		System.out.print("수학 : ");
		math = sc.nextFloat();

		System.out.println("총점 : "+(int) (kor+eng+math));
		System.out.println("평균 : "+(int) (kor+eng+math)/3);
	}

}
