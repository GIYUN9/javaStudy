package com.kh.java.test;
import java.util.*;
import java.math.*;

public class Book {
	//필드

	private int bookId;
	private String title;
	private String author;
	private String publisher;
	//생성자
	public Book(int bookId, String title, String author, String publisher) {

		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	//매서드
	//getter
	public int getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	
	//setter
	public void setBookId(int sBookId) {
		this.bookId = bookId;
	}
	public void setTitle(String sTitle) {
		this.title = title;
	}
	public void setAuthor(String sAuthor) {
		this.author = author;
	}
	public void setPublisher(String sPublisher) {
		this.publisher = publisher;
	}
	
	//book정보 toString
	@Override
	public String toString() {
		String str = this.bookId + "\t" + this.title + "\t" + 
					this.author + "\t" + this.publisher;
		return str;
	}
//	public void toString() {
//		System.out.println();
//
//	}
	//도서명 일치여부
	public boolean equals(String title, String author) {
		return (this.title.equals(title) &&
				this.author.equals(author));
	}
	
}
