package com.kh.collection.silsub2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.kh.collection.silsub2.model.dao.BookDao;
import com.kh.collection.silsub2.model.vo.Book;

public class BookManager {

	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void addBook(Book book) {
		bd.getLastBookNo();
		int lastNum = bd.getLastBookNo();
			book.setbNo(book.getbNo()+1);
			bd.addBook(book);
		}

		public Book deleteBook(String key){
			
		
			
			
			return bd.deleteBook(key);
		// BookDao의 deleteBook() 메소드에 전달받은 도서 번호 전달
		// 그 결과 값을 받아 리턴
		}
		public String searchBook(String title){
			return bd.searchBook(title);
		// BookDao의 searchBook() 메소드에 전달받은 도서 제목 전달
		// 그 결과 값(map의 key값)을 받아 리턴
		}
		public Book selectBook(String key){
			return bd.selectBook(key);
		// BookDao의 selectBook() 메소드에 전달받은 key값 전달
		// 그 결과 값(해당 Book객체)을 받아 리턴
		}
		public HashMap<String, Book> selectAll(){
			
			return bd.selectAll();
		// BookDao의 selectAll() 메소드를 통해 도서 전체를 전달 받아 리턴
		}
		public Book[] sortedBookList(){
			ArrayList<Book> bookList = bd.sortedBookList();
			Book[] bookArr = new Book[bookList.size()];
			for(int i = 0; i < bookList.size(); i++) {
				bookArr[i] = bookList.get(i); 
			}
			
			
			return bookArr;
		// BookDao의 sortedBookList() 메소드를 통해 정렬된 도서 리스트를 전달 받아
		// for문을 이용하여 Book[] 배열에 추가
		// 해당 배열 주소 값 리턴
		}
		public void printBookList(Book[] br) {
			for(Book b :br)
				System.out.println(b);
		// for each문을 이용하여 전달받은 Book[] 배열 전체 출력
		}
}
