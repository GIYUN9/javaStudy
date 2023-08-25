package com.kh.java.test;
import java.util.*;
import java.math.*;
public class MainStart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library lib = Library.getLibInstance();
		
		boolean isLoop = true;
		while(isLoop) {
			switch(lib.BookMenu()) {
				case 1:{ //도서 등록
					lib.joinBook();
				}break;
				case 2:{ //도서 삭제
					lib.deleteLastBook();
				}break;
				case 3:{ //도서 목록 조회
					lib.viewBookList();
				}break;
				case 4:{ //도서 검색
					lib.find();
				}break;
				default:
					isLoop = false;
			}
		}
	}

	
}
