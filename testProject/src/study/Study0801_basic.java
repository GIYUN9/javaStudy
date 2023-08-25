//배열도 객체다


package study;
import java.util.*;
import java.math.*;

public class Study0801_basic {

	public static void main(String[] args) {
		/*
		 * 1. 배열형식의 참조변수 선언
		 * 2. 배열객체 할당 (최초 0으로 생성(초기화))
		 * 3. 배열 데이터 초기화 (값 최초 입력)
		 * 4. 배열 데이터 활용
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		int[] ref = {1, 2, 3, 4, 5, 6};
//	// ==	ref = new int[6];
//	// ==	ref[0] = 1;
//	// ==	ref[1] = 2;
//	// ==	ref[2] = 3;
//	// ==	ref[3] = 4;
//	// ==	ref[4] = 5;
//	// ==	ref[5] = 6;
//		// 반복문을 이용해서 배열 초기화
//		for(int i = 0; i < ref.length; i++) {
//			ref[i]=i+1;
//		}
//		
//		for(int i = 0; i < ref.length; i++ ) {
//			System.out.print(ref[i]);
		
		//int형 변수 num을 생성하고 값을 10으로 초기화
		int num = 10;
		//String형 변수 str을 생성하고 값을 "hi"로 초기화
		String str = "\nhi";
		//num과 str을 출력
		System.out.print(num+str+"\n");
		
		System.out.println("");
		
		//만약 num이 5보다 크다면 "num은 5보다 큰 수입니다"출력
		//더 작다면 "num은 5보다 작은 수 입니다"출력
		//5라면 "num은 5입니다" 출력
		if(num>5) {
			System.out.println(num+"은 5보다 큰 수입니다");
		}else if(num<5) {
			System.out.println(num+"은 5보다 작은 수입니다");
		}else {
			System.out.println(num+"은 5입니다");
		}
		
		System.out.println("");
		
		//반복문을 활용하여 1~num까지 숫자를 순차적으로 출력
		//ex) num = 3일때 1 2 3출력
		// for while각각 작성
		num=3;
		for(int i = 1; i <= num; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		int i = 1;
		while(i <= 3) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println("");
		
		//길이가 20인 int형 배열 arr 생성후 반복문을 이용하여 값을 1~20까지 순차적으로 초기화
		int[] arr = new int[20];
		for(int j = 1; j<=arr.length; j++) {
			arr[j-1]=j;
		}
		//반복문을 이용하여 arr 요소 전체출력
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		
		System.out.println("");
		
		//String형 길이가 5인 배열 arr2을 생성하고 생성과 동시에 {"사과","포도","귤","파인애플","바나나"}로 초기화
		String[] arr2 = {"사과","포도","귤","파인애플","바나나"};
		//반복문을 이용하여 arr2 요소 전체 출력
		for(int j = 0; j<arr2.length; j++) {
			System.out.print(arr2[j]+" ");
		}
}		
}
