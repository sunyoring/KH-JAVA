package com.kh.hw1.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.hw1.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	// 필드
	public void mainMenu() { // 아래의 메뉴 반복 실행
	
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열 ");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1 :
				tokenMenu();
				break;
			case 2 :
				inputMenu();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
				default : 
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					break;
			}
		}


	}
	public void tokenMenu(){
	String str = "J a v a P r o g r a m";
	System.out.println("토큰 처리 전  글자 : " + str);
	System.out.println("토큰 처리 전  개수 : " + str.length());
	// Token 처리 전 글자와 글자 개수를 출력하고
	String afterStr = tc.afterToken(str);
	System.out.println("토큰 처리 후 글자 : " + afterStr);
	System.out.println("토큰 처리 후 개수 : " + afterStr.length());

	System.out.println("모두 대문자로 변환 : " + afterStr.toUpperCase());
	// 위 str을 TokenController의 afterToken() 메소드의 인자로 보내 반환 값 출력
	// 그 반환 값을 이용해 Token 처리 후 글자 개수와 대문자 변환한 것을 출력
	}
	public void inputMenu(){
		sc.nextLine();
		System.out.println("문자열 입력 : ");
		String input = sc.nextLine();
		System.out.println("첫 글자 대문자 : " + tc.firstCap(input));
		System.out.println("찾을 문자 하나 입력 : ");
		char one = sc.nextLine().charAt(0);
		System.out.println(one + " 문자가 들어간 개수  : " + tc.findChar(input, one));
	// 입력 받은 문자열을 TokenController의 firstCap()의 인자로 보내 반환 값 출력
	// 찾을 문자 입력 받아 TokenController의 findChar()의 매개변수로 아까 입력 받은
	// 문자열과 문자 하나를 매개변수로 보내 반환 값 출력
	}
}
