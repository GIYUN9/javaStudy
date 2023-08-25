package testProject;
import java.util.*;


public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month, day, time, min;
		String sec;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 : ");
		year = sc.nextInt();
		System.out.print("월 : ");
		month = sc.nextInt();
		System.out.print("일 : ");
		day = sc.nextInt();
		System.out.print("시 : ");
		time = sc.nextInt();
		System.out.print("분 : ");
		min = sc.nextInt();
		System.out.print("초 : ");
		sec = sc.next();
		
		System.out.println("지금은 "+year+"년 "+month+"월 "+day+"일 "+time+"시 "+min+"분 "+sec+"초입니다.");

	}

}
