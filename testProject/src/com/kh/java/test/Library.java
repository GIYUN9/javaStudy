package com.kh.java.test;
import java.util.*;

import com.kh.javai.Customer;

import java.math.*;

public class Library {
	private final static Book[] BOOK_LIST = new Book[10];
	private static Library libinstance = new Library();
	Scanner sc = new Scanner(System.in);

	private Library() {
		
	}
	
	public static Library getLibInstance() {
		return libinstance;
	}
	
	public int BookMenu() {
		System.out.println("--------------");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 삭제");
		System.out.println("3. 도서 목록");
		System.out.println("4. 도서 검색");
		System.out.println("--------------");
		System.out.println("원하시는 번호를 입력해주세요. (이외번호를 입력하시면 프로그램을 종료합니다.)");
		return sc.nextInt();	
	}
	public void joinBook() {
		if (this.BOOK_LIST[this.BOOK_LIST.length-1] != null) {
			System.out.print("더이상 도서를 등록할 수 없습니다.\n");
			return;
		}
		Book newBook = insertBook();
		saveBook(newBook);
	}
	// 책정보 입력 매서드
	public Book insertBook() {
		int bookId = (int)(Math.random()*100000+1);
		String title;
		String author;
		String publisher;
		
		System.out.print("도서 번호 : "+ bookId+"\n");
		
		System.out.print("도서 이름 : ");
		title = sc.next();
		
		System.out.print("저자명 : ");
		author = sc.next();
		
		System.out.print("출판사 : ");
		publisher = sc.next();
		
		Book tmp = new Book(bookId, title, author, publisher);
		return tmp;
	}
	
	// 책 저장 매서드
	public void saveBook(Book book) {
		for(int i = 0; i < BOOK_LIST.length; i++) {
			if(BOOK_LIST[i] == null) {
				BOOK_LIST[i] = book;
				
				System.out.println(this.BOOK_LIST[i].toString());
				System.out.println("도서 정보가 정상적으로 등록되었습니다.");
				break;
			}
		}
	}
	
	// 책 삭제 매서드(마지막 도서)
//	public void deleteLastBook() {
//		for(int i = this.BOOK_LIST.length - 1; i >= 0; i--) {
//			if (this.BOOK_LIST[i] != null) {
//				System.out.print(this.BOOK_LIST[i].getTitle()+"도서를 삭제하였습니다.");
//				this.BOOK_LIST[i] = null;
//				break;
//			}
//		}
//	}
	public void deleteLastBook() {
		System.out.print("삭제할 도서명을 입력해주세요 : ");
		String dName = sc.next();
	for(int i = this.BOOK_LIST.length - 1; i >= 0; i--) {
		if (this.BOOK_LIST[i] != null && this.BOOK_LIST[i].getTitle().equals(dName)) {
			System.out.print(this.BOOK_LIST[i].getTitle()+"도서를 삭제하였습니다.");
			this.BOOK_LIST[i] = null;
			break;
		}
	}
}

	// 책 목록 출력
//	public void viewBookList() {
//		System.out.println("도서번호\t도서명\t저자\t출판사");
//		for(int i = 0; i <this.BOOK_LIST.length; i++) {
//			if(this.BOOK_LIST[i] == null) {
//				break;
//			}
//			System.out.println(this.BOOK_LIST[i].toString());
//		}
//	}
	
	public void viewBookList() {
		System.out.println("도서번호\t도서명\t저자\t출판사");
		for(int i = 0; i <this.BOOK_LIST.length; i++) {
			int count = i;
			if(this.BOOK_LIST[i] == null) {
				if(count<10) {
					this.BOOK_LIST[i] = this.BOOK_LIST[count + 1 < 10 ? count+1:count];
					count--;
				}
			}else if(i>=0 && i<10) {
				System.out.println(this.BOOK_LIST[i].toString());
			}else {
				break;
			}
		}
	}
	// 책 조회 매서드
	public void find() {
		Book findBook;
		
		String title, author;
		
		System.out.print("도서명 : ");
		title = sc.next();
		System.out.print("저자 : ");
		author = sc.next();
		
		for(int i = 0 ;i < this.BOOK_LIST.length; i++) {
			if(this.BOOK_LIST[i] == null) {
				System.out.println("등록된 도서를 찾을 수 없습니다.");
				break;
			} else if(this.BOOK_LIST[i].equals(title, author)) {
				findBook = this.BOOK_LIST[i];
				System.out.println("검색하신 도서의 도서번호는 ["+ this.BOOK_LIST[i].getBookId() +"]입니다.");
				break;
			}  else if(i == this.BOOK_LIST.length - 1) {
				System.out.println("등록된 도서를 찾을 수 없습니다.");
			}
		}
	}
}
