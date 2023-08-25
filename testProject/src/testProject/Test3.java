package testProject;
import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float wi, he;
		
		System.out.print("가로 : ");
		wi = sc.nextFloat();
		System.out.print("세로 : ");
		he = sc.nextFloat();
		
		System.out.println("면적 : " + (wi * he));
		System.out.println("둘레 : " + (wi + he) * 2);

	}

}
