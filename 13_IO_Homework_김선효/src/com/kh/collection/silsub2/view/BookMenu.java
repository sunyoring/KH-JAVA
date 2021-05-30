package com.kh.collection.silsub2.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.collection.silsub2.controller.BookManager;
import com.kh.collection.silsub2.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookManager bm = new BookManager();

	public void mainMenu() {

		while (true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.println("메뉴 번호 선택 : ");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				Book[] bookArr = bm.sortedBookList();
				bm.printBookList(bookArr);
				break;
			case 3:
				Book book = bm.deleteBook(inputBookNo());
				if(book == null) {
					System.out.println("삭제할 글이 존재하지 않음");
				}else {
					System.out.println("성공적으로 삭제");
				}
				break;
			case 4:
				bm.searchBook(inputBookTitle());
				
				break;
			case 5:
				HashMap<String, Book> map = bm.selectAll();
				if(map == null) {
					System.out.println("없습니다.");
				}else{
					Iterator it = map.iterator;
				}
				break;
			case 6:
				return;
			default:
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요");
				break;
			}
		}

		// addBook (inputBook()이 리턴한 객체) 실행
		// 실행
		// => Book[] 리턴 받아 printBookList(Book[]) 실행
		// deleteBook (inputBookNo()이 리턴한 도서 번호) 실행
		// => Book 리턴 받아 null이 아닐 경우 “성공적으로 삭제”
		/// null일 경우 “삭제할 글이 존재하지 않음”
		// searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
		// => key 리턴 받아 null일 경우 “조회한 글이 존재하지 않음”
		// null이 아닐 경우 selectBook(key) 출력
		// selectAll() 실행
		// => 결과 map 리턴 받아 비어있을 경우 “없습니다.”
		// 아닐 경우 Iterator, keySet()을 이용하여 전체 출력
		// main()으로 리턴

	}

	public Book inputBook() {
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		System.out.println("도서 장르 : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.println("도서 저자 : ");
		String author = sc.nextLine();
		Book book = new Book(category, title, author);

		return book;
	}

	public String inputBookNo() {
		System.out.println("도서 번호 : ");

		return sc.nextLine();
		// “도서 번호 : “ >> 입력 받음 >> 리턴
	}

	public String inputBookTitle() {
		sc.nextLine();
		System.out.println("도서 제목 : ");

		return sc.nextLine();
		// “도서 제목 : “ >> 입력 받음 >> 리턴
	}
}
