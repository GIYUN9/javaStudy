//		int[] ar1 = new int[5];
//		
//		double[] ar2 = new double[7];
//		
//		float[] ar3;
//		ar3 = new float[9];
//		
//		
//		System.out.println("ar1의 길이 : "+ar1.length);
//		System.out.println("ar2의 길이 : "+ar2.length);
//		System.out.println("ar3의 길이 : "+ar3.length);
//		
//		String str = "giyun";
//		System.out.println("str의 길이 : "+str.length());
		
//		String str[] = new String[5];
//		
//		str[0] = "giyun";
//		str[1] = new String ("cafe");
//		str[4] = "hi";
//		str[2] = "tree";
//		str[3] = "na";
//		
//		int count = 0;
//		
//		for(int i = 0; i < str.length; i++ ) {
//			count += str[i].length();
//		}
//		
//		System.out.println("총 문자의 수는 "+count);
		
		// 얕은 복사

//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = new int[5];
//		
////		for (int i = 0; i < arr1.length; i++) {
////            arr2[i] = arr1[i];
////		}
////		for (int i = 0; i < arr2.length; i++) {
////            System.out.println("arr2["+i+"] : "+ arr2[i]);
//	
//		// 보편적인 배열 복사방법
//		arr2 = arr1.clone();
//		
//		// 배열 arr1을 전부 7로 초기화
//		Arrays.fill(arr1, 7);
//		System.out.println(arr1);
//		

//		int[] arr = new int[10];
//		
//		for (int i = 1; i <= arr.length; i++) {
//			arr[i - 1] += i;
//			System.out.print(i + " ");
//		}

//		int[] arr = new int[10];
//		
//		for (int i = arr.length; i >= 1; i--) {
//			arr[i - 1] += i;
//			System.out.print(i + " ");
//		}

//		System.out.print("양의 정수 : ");
//		int num = sc.nextInt();
//		
//		int arr[] = new int[num];
//		
//		for(int i = 1; i<=arr.length; i++) {
//			arr[i - 1] += i;
//			System.out.print(i+" ");
//		}

//		String[] arr = {"사과", "귤", "포도", "복숭아","참외"};
///*
// * 		str[0] = "사과";		
// * 		str[1] = "귤";		
// * 		str[2] = "포도";		
// * 		str[3] = "복숭아";		
// * 		str[4] = "참외";		
// */
//
//		System.out.println(arr[1]);
//===================================
//		String str; //검색할 문자열
//		char ch; //찾을 문자 저장
//		int[] strLoc;//위치값(인덱스) 저장 
//		char[] chrLoc;
//		int count=0;
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//		
//		System.out.print("문자 : ");
//		ch = sc.next().charAt(0);
//		
//		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) : ");
//		for(int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == ch) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		
//		
//		System.out.println("\n"+ch+" 개수 : "+ count);

//		String[] day = {"월","화","수","목","금","토","일"};
//
//		System.out.print("0 ~ 6 사이 숫자 입력 : ");
//		int num = sc.nextInt();
		
//		switch(num) {
//			case 0:	
//			case 1:
//			case 2:
//			case 3:
//			case 4:
//			case 5:
//			case 6:
//				System.out.println(day[num]+"요일");
//					break;
//			default:
//				System.out.println("잘못 입력하셨습니다");
//				
//		}
// =================================================	
//		if(1<=num && num <=6) {
//			System.out.print(day[num]+"요일");
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
//================================================
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		
//		
//		for(int i =0; i<arr.length; i++) {
//			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
//			arr[i] = sc.nextInt();
//		}
//		int sum =0;
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//			sum += arr[i];
//		}
//		System.out.println("\n총 합 : "+sum);
//============================================
//		int num, count = 0;
//		int[] arr;
//		
//		while(true) {
//		System.out.print("정수 : ");
//			num = sc.nextInt();
//			
//			if (num % 2 == 1 && num >= 3) {
//				arr = new int[num];
//			
//				for (int i = 0; i < arr.length; i++) {
//					if((arr.length / 2) < i) {
//						count--;
//					}else {
//						count++;
//					}
//					arr[i] = count;
//				}
//				for (int i = 0; i < arr.length; i++) {
//					System.out.print(arr[i]+ " ");
//				}
//				break;
//			}else {
//				System.out.println("다시 입력하세요.");
//			}
//		}
//===================================================
//		String cName, res = null;
//		String[] chicken = {"후라이드", "양념", "간장", "마늘"};
//		
//		System.out.print("치킨 이름을 입력하세요 : ");
//		cName = sc.next();
//		
//		
//		for(int i = 0; i<chicken.length; i++) {
//			if(chicken[i].equals(cName)) {
//				res = cName+"치킨 배달 가능";
//				break;
//			}else {
//				res = cName+"치킨은 없는 메뉴입니다.";
//			}
//		}
//		
//		System.out.println(res);
//====================================================
//		
////		String num;
//		char[] num = new char[14];
//		char[] ch;
//		System.out.print("주민등록번호(-포함) : "); //123456-1234567
//		num = sc.next().toCharArray();
//		ch = new char[num.length];
//		
//		for(int i = 0; i < ch.length; i++) {
//			if(i >= 8) {
//				ch[i] = '*';
//				continue;
//			}
//			ch[i] = num[i];
//		}
//		
//		for(int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i]);
//		}
//===================================================
//		int[] num = new int[10];
//
//		
//		for(int i = 0; i < num.length; i++) {
//			num[i] = (int)(Math.random()*10+1);
//			}
//		for(int i = 0; i < num.length; i++) {
//			System.out.print(num[i]+" ");
//			}
//		
//		int max = num[0];
//		int min = num[0];
//		
//		for(int i = 0; i < num.length; i++) {
//			if(max < num[i]) {
//				max = num[i];
//			}else if(min > num[i]) {
//				min = num[i];
//			}
//		}
//		
//		System.out.println("\n최대값 : " + max);
//		System.out.println("최소값 : " + min);

// Math.random() : 0보다 크고 1보자 작은 난수 발생 값이 곱하고int형변 취하면정수 난수 생성
package study;
import java.util.*;
import java.math.*;


public class Study0731 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int i = 0;
		//[0,0,0,0,0,0,0,0,0,0]
		while (i < arr.length) {
			//난수 입력받기
			int nan = (int)(Math.random()*10+1);
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == nan) {
					nan = 0;
					break;
				}
			}
			if (nan == 0)
				continue;
			else {
				arr[i] = nan;
				i++;
				}
		}
		for(i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			}	

	}
}

