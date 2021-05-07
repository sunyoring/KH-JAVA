package com.kh.chap02.loof;

import java.util.Scanner;

public class A_For {
	/*
	 * 반복문 : 프로그램의 수행흐름을 제어하는 제어문중 하나, 어떤 실행코드를 반복적으로 수행시켜준다.
	 * 
	 * for문/while문( do- while문)
	 * 
	 * *for문
	 * 
	 * for(초기식;조건식;증감식){//반복 횟수를 지정하기위해서 제시하는것들 ..반복적으로 실행시키고자 하는 실행 구문..
	 * 
	 * }
	 * 
	 * -초기식 : 반복문이 수행될때 "단 한번만 실행되는 구문" (보통 반복문 안에서 사용될 변수를 선언하고 초기값을 대입하는 구문) -조건식
	 * : "반복문이 수행될 조건" 을 작성하는 구문 조건식이 true일 경우 해당 실행 구문을 실행 조건식이 false일 경우 반복을 멈추고
	 * 빠져나옴 (보통 초기식에서 사용된 변수를 가지고 조건식을 작성) -증간식 : 반복문을 제어하는 변수값을 증감시키는 부분 (주로 초기식에
	 * 제시한 변수를 가지고 증감 연산자 사용)
	 * 
	 * 
	 * for문 초기식--> 조건식 검사 -> true일 경우 실행구문을 실행 --> 증감식 --> 조건식 검사 -> true일 경우 실행구문을
	 * 실행 --> 증감식 --반복-- --> 조건식 검사 -> false일 경우 실행구문을 실행 하지 않음 --> 반복문을 빠져나옴
	 * 
	 * * 알아둘것 ~ for 문안에 있는 초기식, 조건식, 증감식은 모두 생략 가능 하긴 함(하지만 ; 은 반드시 필수 작성) 즉,for()
	 * 안에서만 생략 될뿐 모두 필요한 요소임.
	 */

	public void method1() {
		// "안녕하세요"를 5번 출력하고자 할 때

		/*
		 * System.out.println("안녕하세요"); System.out.println("안녕하세요");
		 * System.out.println("안녕하세요"); System.out.println("안녕하세요");
		 * System.out.println("안녕하세요");
		 */

		for (int i = 1; i <= 5; i++) { // i값이 1부터 5보나 작거나 같을때까지 1씩 증가하며 반복(5회)
			System.out.println("안녕하세요     " + i);
		}

		for (int i = 0; i < 5; i++) { // i값이 0부터 4까지 1씩 증가하며 반복(5회)
			System.out.println("안녕하세요     " + i);
		}
	}

	public void method2() {
		// 1 2 3 4 5 이런 형태로 출력 하고자한다면

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + " ");
		}

		// 5 4 3 2 1

		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");

		}
	}

	public void method3() {
		// 1부터 10 사이의 홀수만 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}

	public void method4() {
		// 1 2 3 4 ... 8 9 10
		for (int i = 0; i <= 9; i++) {
			System.out.print(i + 1 + " ");
		}
	}

	public void method5() {
		// 1부터 10까지 정수들 합계

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println("총 합계 : " + sum);
	}

	public void method6() {

		// 1부터 사용자가 입력한 수까지의 합계

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println("총 합계 : " + sum);

	}

	public void method7() {

		// 1부터 어떤 랜덤값(1~10사이)
		/*
		 * java.lang.Math 클래스에서 제공하는 random()메소드를 사용해서 랜덤값 발생시킬 수 있다.
		 * 
		 * Math.random() 호출시 --> 0.0 ~ 0.999999 사이의 랜덤값 발생 시켜줌 (0.0 <= 랜덤값 < 1.0)
		 */

		// int random = Math.random(); // double형이라서 안됨
		// 0.0 <= < 1.0 --> 0.0 ~ 0.99999...

		// int random = Math.random() * 10;
		// 0.0 <= < 10.0 --> 0.0 ~ 9.99999...

		// int random = Math.random() * 10 + 1;
		// 1.0 <= < 11.0 --> 1.0 ~ 10.9999...
		int random = (int) (Math.random() * 10 + 1);
		// 1 <= < 11 --> 1 ~ 10 Random);

		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("1부터" + random + "까지의 합 : " + sum);

	}

	public void method8() {
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

		// 마지막 인덱스는 항상 문자열의 길이 -1
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();

		System.out.println("문자열의 길이 " + str.length());

		for (int i = 0; i < str.length(); i++) {

			System.out.println(str.charAt(i) + "  " + i);
		}
	}

	public void method9() {
		// 2단 출력하기
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 =18

		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
	}

	public void method10() {
		// 사용자가 입력한 단을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("단수(2~9)를 입력하세요 : ");
		int dan = sc.nextInt();
		if (dan > 1 && dan < 10) {
			for (int i = 1; i < 10; i++) {
//				System.out.println(dan + " * " + i + " = " + dan * i);
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		} else {
			System.out.println("2~9사이의 양수를 입력하세요.");
		}

	}

	public void method11() {
		int random = (int) Math.random() * 8 + 2;
		// 0.0 <= < 1.0
		// 0.0 <= < 8.0 (*8 했을 때)
		// 2.0 <= < 10.0 (+2했을 때)
		// 2 <= < 10 (int) 형 변환했을 때
		System.out.println("=====" + random + "=====");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", random, i, random * i);
		}
	}

	// 중첩 for문
	/*
	 * for(초기식1; 조건식1; 증감식1) { 수행할 문장 1;
	 * 
	 * for(초기식2; 조건식2; 증감식2){ 수행할 문장 2; }
	 * 
	 * 수행할 문장 3; }
	 * 
	 */
	public void method12() {
		// 1부터 5까지 연이어서 출력되는 문장을 3줄 출력
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}

	public void method13() {
		// 2단부터 9단까지 출력
		// 단 2~0 까지 1씩 증가 --> 바깥 for문
		// 곱ㅎ재니는 수 매 단마다 1부터 9까지 1씩 증가 --> 안쪽 for문

		// ==2단==

		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 2 * 8 = 18

		// ==3단==

		// 3 * 1 = 3
		// 3 * 2 = 6
		// 3 * 3 = 0

		// ..

		// ==9단==
		// 9 * 1 = 9
		// 9 * 2 = 18

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("=== " + dan + "단 ===");
			for (int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + dan * su);
			}
			System.out.println();
		}

	}

	public void method14() {
		// *****
		// *****
		// *****
		// *****

		// 행이 1~4 까지 반복 (4번) --> 바깥 for문
		// 열이 1~5 까지 (5번) --> 안쪽 for문

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method15() {
		// 1***
		// *2**
		// **3*
		// ***4
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public void method16() {
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
