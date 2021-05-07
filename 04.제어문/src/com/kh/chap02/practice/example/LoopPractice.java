package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			if (i < 0) {
				System.out.println("잘못입력하셨습니다.");
			}
			System.out.print(i + " ");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			if (i < 0) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			System.out.print(i + " ");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = num; i <= 1; i--) {
			if (num < 1) {
				System.out.println("잘못입력하셨습니다.");
			} else {
				System.out.print(i + " ");

			}

		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = num; i <= 1; i--) {
			if (num < 1) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			} else {
				System.out.print(i + " ");

			}

		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i);
			for (int j = 1; j < num; j++) {
				if (i == j) {
					System.out.print(" + ");
					continue;

				}
			}
		}
		System.out.print(" = " + sum);

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			for (; num1 <= num2; num1++) {
				System.out.print(num1 + " ");
			}
			for (; num2 <= num1; num2++) {
				System.out.print(num2 + " ");
			}
		}else {
			System.out.println("1이상의 숫자만 입력해주세요");
		}
		
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.println("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 >= 1 && num2 >= 1) {
				for (; num1 <= num2; num1++) {
					System.out.print(num1 + " ");
				}
				for (; num2 <= num1; num2++) {
					System.out.print(num2 + " ");
				}
			}else {
				System.out.println("1이상의 숫자만 입력해주세요");
				continue;
			}
			

		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int dan = sc.nextInt();

		System.out.println("===== " + dan + "단 =====");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int dan = sc.nextInt();

		if (dan <= 9 && dan >= 2) {
			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + dan + "단 =====");

				for (int j = 1; j <= 9; j++) {
					System.out.println(dan + " * " + j + " = " + dan * j);

				}
			}

		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자 : ");
			int dan = sc.nextInt();

			if (dan <= 9 && dan >= 2) {
				for (int i = dan; i <= 9; i++) {
					System.out.println("===== " + dan + "단 =====");

					for (int j = 1; j <= 9; j++) {
						System.out.println(dan + " * " + j + " = " + dan * j);

					}
				}

			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
				continue;
			}
		}

	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);

		System.out.println("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.println("공차 : ");
		int gap = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(start + sum + " ");
			sum += gap;

		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산자(+ ,- , *, /, %) :");
		String str = sc.nextLine();
		System.out.println("정수 1 :");
		int num1 = sc.nextInt();
		System.out.println("정수 2 :");
		int num2 = sc.nextInt();
		int result = 0;
		while (true) {
			if (str.charAt(0) == '+') {
				result = num1 + num2;

			} else if (str.charAt(0) == '-') {
				result = num1 - num2;

			} else if (str.charAt(0) == '*') {
				result = num1 * num2;

			} else if (str.charAt(0) == '/') {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
				result = num1 / num2;

			} else if (str.charAt(0) == '%') {
				result = num1 % num2;

			} else if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;

			}

		}
	}

}
