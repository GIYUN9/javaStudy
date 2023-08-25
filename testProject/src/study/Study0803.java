//		// double형 변수 num을 생성하고 3.75를 대입해라
//		double num = 3.75;
//		
//		// int형 변수 num2를 생성하고 숫자를 하나 입력받아라
//		int num2 = sc.nextInt();
//		
//		// 입력받은 num2(길이)를 활용하여 1차원 배열 arr을 하나 만들고 모든 수를 5로 초기화한다
//		int[] arr = new int[num2];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = 5;
//		}
//		
//		// arr배열의 인덱스 2에 값에 0을 넣어준다.
//		arr[2] = 0;
//		
//		// arr배열을 처음부터 끝가지 아래와 같은 방식으로 출력한다.
//		// 배열안에 값이 5일때 5출력
//		// 배열안에 값이 0일때 "5가 아닙니다"
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i]==5) {
//				System.out.println(arr[i]+" ");
//			}else {
//				System.out.println("5가 아닙니다");
//			}
//		}
//================================================
//		System.out.print("국어 : ");
//		int kor = sc.nextInt();
//		System.out.print("영어 : ");
//		int eng = sc.nextInt();
//		System.out.print("수학 : ");
//		int math = sc.nextInt();
//		
//		int sum = kor+eng+math;
//		float avg = sum/3;
//		
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+avg);
//		
//		if(avg>=60 && kor>=50 && eng>=50 && math>=50) {
//			System.out.print("합격");
//		} else {
//			System.out.print("불합격");
//		}
//================================================
//		int num;
//		do {System.out.print("1이상의 숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		 
//		if(num >=1) {
//			for(int i = num; i > 0; i--) {
//				System.out.print(i + " ");
//				
//			}break;
//		}
//		else{
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//			}
//		} while(true);
//================================================
//		int row, col;
//		do { 
//			System.out.print("행 크기 : ");
//			row = sc.nextInt();
//			if(row < 1 || row > 10) {
//				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");	
//			}
//		} while(row < 1 || row > 10);
//		
//		do { 
//			System.out.print("열 크기 : ");
//			col = sc.nextInt();
//			if(col < 1 || col > 10) {
//				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");	
//			}
//		} while(col < 1 || col > 10);
//		
//		char[][] arr = new char[row][col];
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				char ch = (char)(Math.random()*26+65);
//				arr[i][j] = ch;
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//===================================================
//미완	char[][] chArr = new char[5][5];
//		int num=0;
//		String str = "이까왔앞힘차지습으냅원열니로시배심다좀다열히!더!!";
//		for(int i = 0; i<chArr.length; i++){
//			chArr[i]= str.toCharArray();
//			for(int j = 0; j < chArr[i].length; j++) {
//				while(true) {
//					if()
//				chArr[i][j] = str.charAt(num++);
//				}
//			}
//				
//		}
//		System.out.print(Arrays.deepToString(chArr));
//=====================================================
//int row, col;
//      
//      do {
//         System.out.print("행의 크기(1 ~ 10)를 입력하세요: ");
//         row = sc.nextInt();
//        
//         if (row < 1 || row > 10)
//            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
//      } while(row < 1 || row > 10);
//      
//      do {
//         System.out.print("열의 크기(1 ~ 10)를 입력하세요: ");
//         col = sc.nextInt();
//        
//         if (col < 1 || col > 10)
//            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
//      } while(col < 1 || col > 10);
//      
//      
//      char[][] arr = new char[row][col];
//      for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[i].length; j++) {
//            arr[i][j] = (char)(Math.random() * 26 + 65);
//         }
//      }
//      
//      for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[i].length; j++) {
//            System.out.print(arr[i][j] + " ");
//         }
//         System.out.println();
//      }
     
     
//      String[][] strArr = new String[][] {
//         {"이", "까", "왔", "앞", "힘"},
//         {"차", "지", "습", "으", "냅"},
//         {"원", "열", "니", "로", "시"},
//         {"배", "심", "다", "좀", "다"},
//         {"열", "히", "! ", "더", "!! "}};
//        
//      for (int i = 0; i < strArr[i].length; i++) {
//         for (int j = 0; j < strArr.length; j++) {
//            System.out.print(strArr[j][i] + " ");
//         }
//         System.out.println();
//      }
//==========================================================
//		String[] stu = {"강건강","남나나","도대담","류라라","문미미",
//				"박보배","송설실","윤예의","진재주","차천축","파풍표","홍하하"};
//		
//		String[][] classRoom1 = new String[3][2];
//		String[][] classRoom2 = new String[3][2];
//		
//		int index = 0;
//		for(int i = 0; i <classRoom1.length; i++) {
//			for(int j = 0; j < classRoom1[i].length; j++) {
//				classRoom1[i][j] = stu[index++];
//			}
//		}
//		for(int i = 0; i <classRoom2.length; i++) {
//			for(int j = 0; j < classRoom2[i].length; j++) {
//				classRoom2[i][j] = stu[index++];
//			}
//		}
//		//출력
//		System.out.println("== 1분단 ==");
//		for(int i = 0; i <classRoom1.length; i++) {
//			for(int j = 0; j < classRoom1[i].length; j++) {
//				System.out.print(classRoom1[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("== 2분단 ==");
//		for(int i = 0; i <classRoom2.length; i++) {
//			for(int j = 0; j < classRoom2[i].length; j++) {
//				System.out.print(classRoom2[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("===================");
//		System.out.print("검색할 학생 이름을 입력하세요 : ");
//		String name = sc.next();
//		
//		for(int i = 0; i <classRoom1.length; i++) {
//			for(int j = 0; j < classRoom1[i].length; j++) {
//				if(classRoom1[i][j].equals(name)) {
//					System.out.print("검색하신 "+name+"학생은 1분단 "+(i+1)+" 번째 줄 "+(j%2==0 ? "왼쪽":"오른쪽")+"에 있습니다.");
//				}
//			}
//		}
//		for(int i = 0; i <classRoom2.length; i++) {
//			for(int j = 0; j < classRoom2[i].length; j++) {
//				if(classRoom2[i][j].equals(name)) {
//					System.out.print("검색하신 "+name+"학생은 2분단 "+(i+1)+" 번째 줄 "+(j%2==0 ? "왼쪽":"오른쪽")+"에 있습니다.");
//				}
//			}
//		
//		}
//======================================================================
package study;
import java.util.*;
import java.math.*;
public class Study0803 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
	}
}