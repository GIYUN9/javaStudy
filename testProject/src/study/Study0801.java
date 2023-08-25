//		int[] arr = new int[6];
//		int i = 0;
//		while(i < arr.length) {
//			int nan = (int)(Math.random()*45+1);
//			
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[j] == nan) {
//					nan=0;
//					break;
//				}
//			}
//			if(nan ==0){
//				continue;
//			}else {
//				arr[i] = nan;
//				i++;
//			}
//		}
//		
//		int[] arr = new int[6];
//		
//		for (int i = 0; i < arr.length; i++) {
//			int nan = (int)(Math.random()*45+1);
//			
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[j] == nan) {
//						nan=0;
//					break;
//				}
//			}
//			if(nan == 0){
//				continue;
//			}else {
//				arr[i] = nan;
//			}
//		}
//		
////난수생성	for(int i = 0; i < arr.length; i++) {
////중복없이		arr[i] = (int)(Math.random()*45+1);
////			for(int j = 0; j < i; j++) {
////				if(arr[i] == arr[j]) {
////					i--;
////					break;
////				}
////			}
////		}
//		
////		for(i = 0; i < arr.length; i++) {
////			System.out.print(arr[i]+" ");
////			}
//		
//		Arrays.sort(arr);
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//			}
//
//		String str;
//		char[] strArray;
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//		// application
//		
//		strArray = new char[str.length()];
//		
//		int i = 0, j = 0, count = 0;
//
//		while(i < str.length()) {
//			strArray[j] = str.charAt(i);
//			//중복검사
//			for(int k = 0; k < j; k++) {
//				if(strArray[j] == strArray[k]) {
//					j--;
//				break;
//				}
//			}
//			i++;
//			j++;
//		}
//
//		for(int h = 0; h < strArray.length; h++) {
//			if(h==(strArray.length - 1) || strArray[h + 1] == 0) {
//				System.out.println(strArray[h]);
//				System.out.print("문자 개수 : "+(h+1));
//				break;
//			}
//			System.out.print(strArray[h] + ", ");
//		}
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("배열의 크기를 입력하세요 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		String[] strArray1, strArray2;
//		
//		strArray1 = new String[num];
//		int i = 0;
//		while(true) {
//			// 문자열 입력받는 부분
//			for(; i < strArray1.length; i++) {
//				System.out.print((i+1)+"번째 문자열 : ");
//				strArray1[i]= sc.nextLine();
//			}
//			
//			//더 입력할지 안할지 확인부분
//			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
//			
//			//더 입력하겠다.
//			char ch = sc.next().charAt(0);
//			
//			if(ch == 'Y' || ch == 'y') {
//				System.out.print("더 입력하고 싶은 개수 : ");
//				num = sc.nextInt();
//				sc.nextLine();
//				
//				strArray2 = new String[strArray1.length + num];
//				
//				for(i = 0; i < strArray1.length; i++) {
//					strArray2[i] = strArray1[i]; 
//				}
//				strArray1 = strArray2;
//				// 배열 추가로 크게 생성해주고
//				//복제
//			}else if (ch == 'N' || ch == 'n'){
//				System.out.println(Arrays.toString(strArray1));
//				break;
//			}
//		}
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		arr[1][0] = 5;
//		arr[1][1] = 6;
//		arr[1][2] = 7;
//		arr[1][3] = 8;
//		arr[2][0] = 9;
//		arr[2][1] = 10;
//		arr[2][2] = 11;
//		arr[2][3] = 12;
//		
//		arr[2][0] = 5;
//		arr[2][1] = 5;
//		arr[2][2] = 5;
//		arr[2][3] = 5;
//		
//		arr[1][0] = 5;
//		arr[1][1] = 5;
//		arr[1][2] = 5;
//		arr[1][3] = 5;
//		
//		for(int i = 0; i < arr[1].length; i++) {
//			arr[1][i]=5;
//		}
//		
//		arr[0][0] = 5;
//		arr[1][0] = 5;
//		arr[2][0] = 5;
//	
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j]=5;
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		int[][] arr = new int[3][4];
//		int[][] arr = {{5,5,5,5}, {5,5}, {5,5,5}}; //가능

		//크기가 각각 4, 3, 5, 2인 1차원배열들로 
		//생성된 2차원배열 만들고 값 전부 10으로 초기화
//		int[][] arr = {{10,10,10,10},
//						{10,10,10,},
//						{10,10,10,10,10},
//						{10,10}};
//		String[][] arr = new String[3][3];
//		
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j]= ("(" + i + ", " + j + ")");
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
//		char[][] arr = new char[3][3];
//		char ch = 'a';
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = ch++;
//				arr[2][0]='G';
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		int[][] arr = new int[4][4];
//		int num=16;  // num=1; 오름차순
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num--; //num++; 오름차순
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
package study;
import java.util.*;
import java.math.*;

//(Math.random()*10+1) = 난수 
// Arrays.sort(배열) = 오름차순 정렬 
// Arrays.sort(배열, Collections.reverseOrder()); = 내림차순 정렬

public class Study0801 {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];

		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = (int)(Math.random()*45+1);
			}
		}
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr[i].length-1; j++){
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];				
			}
			arr[3][3] += arr[i][3];
		}
		//출력
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
}
}