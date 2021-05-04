package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		String result = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		String result = num == 0 ? "0이다" : (num > 0 ? "양수다" : "음수다");
		System.out.println(result);
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);

	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("인원 수 : ");
		int num1 = sc.nextInt();
		System.out.println("사탕 개수 : ");
		int num2 = sc.nextInt();

		int result1 = num2 / num1;
		int result2 = num2 % num1;
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);

	}

	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("학년(숫자만) : ");
		int num1 = sc.nextInt();

		System.out.println("반(숫자만) : ");
		int num2 = sc.nextInt();

		System.out.println("번호(숫자만) : ");
		int num3 = sc.nextInt();

		System.out.println("성별(M/F) : ");
		String gender = sc.nextLine().charAt(0) == 'M' ? " 남학생" : " 여학생";
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double num4 = sc.nextDouble();

		System.out.println(num1 + "학년 " + num2 + "반 " + num3 + "번  " + name + gender + "의 성적은 " + num4 + "이다.");
	}

	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int age = sc.nextInt();

		String result = age <= 13 ? "어린이" : age <= 19 ? "청소년" : "성인";
		System.out.println(result);
	}

	public void method7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int mat = sc.nextInt();

		int result1 = kor + eng + mat;
		double result2 = (kor + eng + mat) / 3;

		String result3 = ((kor >= 40) && (eng >= 40) && (mat >= 40) && (result2 >= 60)) ? "합격" : " 불합격 ";
		System.out.println("합계 : " + result1);
		System.out.println("평균 : " + result2);
		System.out.println(result3);
	}

	public void method8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		char ch = sc.nextLine().charAt(7);
		String gender = ch == 2 ? "여자" : "남자";
		System.out.println(gender);
	}

	public void method9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();
		System.out.println("입력 : ");
		int num3 = sc.nextInt();

		boolean result = (num3 <= num1 || num3 > num2) ? true : false;
		System.out.println(result);
	}

	public void method10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력1 : ");
		int num1 = sc.nextInt();
		System.out.println("입력2 : ");
		int num2 = sc.nextInt();
		System.out.println("입력3 : ");
		int num3 = sc.nextInt();

		boolean result = (num1 == num2 && num2 == num3) ? true : false;

	}

	public void method11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("A사원의 연봉 : ");
		double A = sc.nextDouble();
		A = A + (A * 0.4);
		System.out.println("B사원의 연봉 : ");
		double B = sc.nextDouble();

		System.out.println("C사원의 연봉 : ");
		double C = sc.nextDouble();
		C = C + (C * 0.15);

		String resultA = A >= 3000 ? "3000만원 이상" : "3000만원 미만";
		String resultB = B >= 3000 ? "3000만원 이상" : "3000만원 미만";
		String resultC = C >= 3000 ? "3000만원 이상" : "3000만원 미만";

		System.out.println("A사원의 인센티브포함 연봉 : " + A);
		System.out.println(resultA);
		System.out.println("B사원의 인센티브포함 연봉 : " + B);
		System.out.println(resultB);
		System.out.println("C사원의 인센티브포함 연봉 : " + C);
		System.out.println(resultC);

	}

}
