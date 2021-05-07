package com.kh.chap02.loof;

import java.util.Scanner;

public class B_While {
	/*
	 * * while문
	 * 
	 * [초기식]
	 * 
	 * while(조건식) { 반복적으로 실행할 코드; [증감식] }
	 * 
	 * 조건식이 true일 경우 해당 실행코드 실행
	 * 
	 * 조건식 검사 --> true일 경우 실행코드 실행 조건식 검사 --> true일 경우 실행코드 실행 조건식 검사 --> false일 경우
	 * 실행코드 실행 X --> 반복문 빠져 나감
	 * 
	 * 
	 */
	public void method1() {
//		int i = 1;
//		while (i <= 5) {
//			System.out.println("안녕하세요");
//			i++;
//		}
//
//		System.out.println();

		// 1 2 3 4 5
		int i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();

		// 5 4 3 2 1

		i = 5;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
	}

	public void method2() {
		// 1에서 10사이의 홀수만 출력
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.print(i + " ");

			}
			i++;
		}
		System.out.println();

		// 방법 2

		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
	}

	public void method3() {
		// 1부터 랜덤한 값 (1~10) 까지의 합계

		int random = (int) (Math.random() * 10 + 1);

		System.out.println("랜덤 값 : " + random);

		int sum = 0;

		int i = 1;
		while (i <= random) {

			sum += i;
			i++;
		}
		System.out.println("1부터 " + random + "까지의 합 " + sum);
	}

	public void method4() {
		// 사용자가 입력한 단의 구구단을 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력 : ");
		int num = sc.nextInt();

		if (num < 2 || num > 9) {
			int i = 1;
			while (i <= 9) {
				System.out.println(num + " * " + i + " = " + num * i);
				i++;
			}
		} else {
			System.out.println("2~9사이의 양수를 입력하세요.");
		}

	}

	public void method5() {
		// 사용자에게 문자열을 입력받아 각 인덱스 별로 문자 추출

		Scanner sc = new Scanner(System.in);

		// apple -> str
//		a->str.charAt(0);
//		b->str.charAt(1);
//		c->str.charAt(2);
//		d->str.charAt(3);
//		e->str.charAt(4);

		// apple의 문자열의 길이 --> 5
		// 01234
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();

		System.out.println("문자열의 길이 : " + str.length());

		int i = 0;
		while (i < str.length()) {
			System.out.println(str.charAt(i) + " " + i);
			i++;
		}
	}

	public void method6() {
		// 메뉴관련
		Scanner sc = new Scanner(System.in);

		while (true) {// 반복적으로 메뉴를 출력 할 수 있게

			System.out.println();
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 1부터 5까지의 출력"); // method1()
			System.out.println("2. 1에서 10사이의 홀수만 출력"); // method2()
			System.out.println("3. 1부터 랜덤한 값(1~10)까지의 합계"); // method3()
			System.out.println("9.프로그램 종료");

			System.out.println("메뉴선택 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하였습니다.");
				break;
			}

		}
	}

	public void method7() {
		// 계속 문자열을 입력하고 그 문자열을 출력한다.
		// 문자열이 "exit"이면 반복 종료
		Scanner sc = new Scanner(System.in);

		String str = "";
		while (!str.equals("exit")) {

			System.out.println("문자열 입력 :");
			str = sc.nextLine();

			System.out.println(" : " + str);
			System.out.println();

		}
		System.out.println("exit입력으로 프로그램 종료");

	}

	public void method8() {
		//method7()을 break이용
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("문자열 입력 :");
			String str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}
			System.out.println("str : " + str);
			System.out.println();

		}
		System.out.println("exit입력으로 프로그램 종료");

	}
}
