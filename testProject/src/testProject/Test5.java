package testProject;
import java.util.*;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char ch1, ch2;
		
		System.out.print("문자 : ");
		ch1 = sc.next().charAt(0);
		System.out.println("A unicode : "+(ch1+0));
		
		System.out.print("문자 : ");
		ch2 = sc.next().charAt(0);
		System.out.print("A unicode : "+(ch2+0));
	}
}
