//============================================================
//		//문자형 변수 str을 생성하고 "안녕하세요"로 초기화한다.
//		//만약 str의 있는 값이 hi라면 "hi" 아니라면 str의 들어있는 값을 출력
//		String str = "안녕하세요";
//		if (str.equals("hi")) {
//			System.out.println("hi");
//		}else {
//			System.out.println(str);
//		}
//		//길이가 8인 정수형 1차원배열 arr을 생성하고 값을 전부 5로 초기화
//		//arr에 들어있는 데이터를 전부 출력한다.
//		int[] arr = new int[8];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i]=5;
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println(); //개행
//		System.out.println("Arrays.toString(arr)사용");
//		System.out.println(Arrays.toString(arr));
//		
//		//3행2열의 char형2차원 배열 arr2를 생성하고 a~f를 순차적으로 대입한다.
//		//arr2에 들어있는 데이터를 전부 출력한다.
//		char[][] arr2 = new char[3][2];
//		char ch = 'a';
//		for(int i = 0; i < arr2.length; i++) {
//			for(int j = 0; j < arr2[i].length; j++) {
//				arr2[i][j]=ch++;
//				System.out.print(arr2[i][j]+" ");
//			}
//		}
//		System.out.println(); //개행
//		System.out.println("Arrays.deepToString(arr)사용");
//		System.out.println(Arrays.deepToString(arr2));
package study;
import java.util.*;
import java.math.*;



public class Study0802 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random()*45+1);
			}

		}
		
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr[i].length-1; j++){
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];	
				
			}
			arr[3][3] += arr[i][3]*2;
		}
		//전체 출력
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

}
}
