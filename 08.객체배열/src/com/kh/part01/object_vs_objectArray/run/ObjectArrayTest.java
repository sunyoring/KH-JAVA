package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// 1.기본자료형 배열
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// arr의 자료형:int[] -->레퍼런스 벼수 ==주소값을 가지는 변수
		// arr[index]의 자료형 : int -->일반변수 ==실제값을 가지는 변수

		// 2.객체들을 여러개 담을 때 객체배열을 사용
		Book[] books = new Book[3];

		// books의 자료형 : Book[] -->레퍼런스 변수 ==주소값을 가지는 변수
		// books[index]의 자료형 : Book -->레퍼런스 변수 ==주소값을 가지는 변수
		// books[index] = 객체생성;

		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();

		System.out.println(books);
		System.out.println(books[0]);
		System.out.println(books[0].getPrice());// books[0].getPrice()의 자료형 : int : -->실제 값을 가지고 있다.

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < books.length; i++) {
			System.out.println(i + 1 + "번째 도서 정보 입력");
			System.out.println("제목 : ");
			String title = sc.nextLine();
			System.out.println("저자 : ");
			String author = sc.nextLine();
			System.out.println("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.println("출판사 : ");
			String publisher = sc.nextLine();

			books[i] = new Book(title, author, price, publisher); 
			//해당 인덱스로 사용한 값을 가지고 객체를 생성하여 조건처리할 필요가 없어졌다.

		} // 객체 생성
		
		
		//도서 정보 조회
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}
		
		//도서 제목 검색
		
		System.out.println();
		
		System.out.println("검색할 책 제목 : ");
		System.out.println();
		System.out.println("검색할 책 제목을 입력하세요 ! ");
		String str = sc.nextLine();
		//반목문을 통해 각 인덱스의 제목과 비교
		
//		for (int i = 0; i < books.length; i++) {
//			
//			
//			if(str.equals(books[i].getTitle())) {
//				System.out.println(books[i].information());
//				//반복문을 통해 해당 객체의 정보를 출력
//			}
//		
//		} 
		
	
		
		//일반 for문 --> for-loop문
		//for each문 (향상된 for문)
		
//		for(int num : arr) {
//			System.out.println("num : " + num); 
//			//해당 배열만큼 반복하면서 반복문이 실행될 때마다 0번째 인덱스부터 마지막 인덱스까지 값이 num에 담긴다. 
//		}
		for(Book b :books) {
			System.out.println("b : " + b.information());
		}

	}

	
	
	
	
	
	
	
	
	
}
