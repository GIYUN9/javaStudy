		// 객체배열 생성하는 방법
		// 클레스이름[] 객체이름 = new 클레스이름[길이(크기)];
//		Product iceAme = new Product("아이스 아메리카노", 3500, "아이스 아메리카노입니다.");
//		Product latte = new Product("카페라떼", 4000, "카페라떼 입니다.");
//		Product hotChoco = new Product("핫 초코", 2000, "핫초코 입니다.");
//		
//		System.out.println(iceAme.toString());
//		System.out.println(latte.toString());
//		System.out.println(hotChoco.toString());
//		Product[] drinkArr = new Product[3];
//		for(int i = 0; i < drinkArr.length; i++) {
//			System.out.println(drinkArr[i].toString());
//		}

package com.kh.iclass;
import java.util.*;

public class MainStart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CafePos pos = CafePos.getInstnance();
		//메뉴 생성, 삭제, 수정, 조회, 전체출력
		
		
		while(pos.getIsRun()) {
			int number = pos.printMenu();
			switch(number) {
				case 1:{ //생성
					pos.insertMenu();
				}break;
				case 2:{ //수정
					pos.updateDrinkUnit();
				}break; 
				case 3:{ //조회
					pos.searchDrinkUnit();
				}break;
				case 4:{ //삭제
					pos.deleteDrinkUnit();
				}break;
				case 5:{ //전체메뉴확인
					pos.printDrinkArr();
				}break;
					default:
					pos.setIsRun(false);
			}
		}

	}
}
