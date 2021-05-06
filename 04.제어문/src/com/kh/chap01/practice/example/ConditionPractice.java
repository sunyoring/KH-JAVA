package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void method1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴번호를 입력하세요 : ");
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (num == 2) {
			System.out.println("수정 메뉴입니다");

		} else if (num == 3) {
			System.out.println("조회 메뉴입니다");

		} else if (num == 4) {
			System.out.println("삭제 메뉴입니다");

		} else if (num == 9) {
			System.out.println("프로그램이 종료됩니다");
		}

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("국어점수 : ");
		int kor = sc.nextInt();

		System.out.println("수학점수 : ");
		int mat = sc.nextInt();

		System.out.println("영어점수 : ");
		int eng = sc.nextInt();

		int sum = kor + eng + mat;
		double avg = (kor + eng + mat) / 3;

		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		if (kor >= 40 && eng >= 40 && mat >= 40) {
			if (avg >= 60) {
				System.out.println("축하합니다, 합격입니다!");
			}
		} else {
			System.out.println("불합격입니다.");
		}

	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String season = "";
		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;

		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			return;
		}
		System.out.println(month + "월은 " + season + "입니다.");

	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		String user = "서뇨";
		int password = 1234;

		System.out.println("아이디 : ");
		String inputUser = sc.nextLine();
		System.out.println("비밀번호 : ");
		int inputPassword = sc.nextInt();

		if (user.equals(inputUser)) {
			if (password == inputPassword) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}

	}

	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");

		String user = sc.nextLine();

		if (user.equals("관리자")) {

			System.out.println("회원관리, 게시글 관리");
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");
		} else if (user.equals("회원")) {
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");

		} else if (user.equals("비회원")) {
			System.out.println("게시글 조회");

		} else {
			System.out.println("잘못 입력했습니다.");
		}

	}

	public void method7() {
		Scanner sc = new Scanner(System.in);

		System.out.println("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();

		double bmi = kg / (height * height);

		String a = "";
		if (bmi < 18.5) {
			a = "저체중";
		} else if (bmi < 23) {
			a = "정상체중";
		} else if (bmi < 25) {
			a = "과체중";
		} else if (bmi < 30) {
			a = "비만";
		} else {
			a = "고도 비만";
		}
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(a);
	}

	public void method8() {
		Scanner sc = new Scanner(System.in);

		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		sc.nextLine();

		System.out.println("연산자를 입력(+,-,*,/,%)");
		char ch = sc.nextLine().charAt(0);

		int result = 0;
		switch (ch) {
		case '+':
			result = num1 * num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("잘못 입력하였습니다. 프로그램을 종료합니다.");
			return;
		}
		System.out.printf("%d %s %d = %d", num1, ch, num2, result);
	}

	public void method9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("중간 고사 점수 : ");
		double middleTest = sc.nextDouble();
		middleTest *= 0.2;
		System.out.println("기말 고사 점수 : ");
		double finalTest = sc.nextDouble();
		finalTest *= 0.3;
		System.out.println("과제 점수 : ");
		double report = sc.nextDouble();
		report *= 0.3;
		System.out.println("출석 횟수 : ");
		int att = sc.nextInt();

		double sum = middleTest + finalTest + report + att;



		if (sum < 70) {
			if (att < 14) {
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
				System.out.println("FAIL [출석 횟수 부족] (" + att + "/20)");
			} else {
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
			}
		} else {
			System.out.println("중간 고사 점수(20) : " + middleTest);
			System.out.println("기말 고사 점수(30) : " + finalTest);
			System.out.println("과제 점수(30) : " + report);
			System.out.println("출석 점수(20) : " + att);
			System.out.println("=========결과==========");
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
	
		}
//		if(sum>=70) {
//			if(att>=14) {
//				System.out.println("==========결과=========");
//				System.out.println("중간 고사 점수 (20) : "+middleTest);
//				System.out.println("기말 고사 점수 (30) : "+finalTest);
//				System.out.println("과제 점수 (30) : "+report);
//				System.out.println("출석 점수 (20) : "+att);
//				System.out.println("총점 :"+sum);
//				System.out.println("PASS");
//			}else {
//				System.out.println("FAIL[출석 횟수 부족] ("+att+"/20)");
//			}
//		}else if (att<14) {
//			System.out.println("FAIL[출석 횟수 부족] ("+att+"/20)");
//			System.out.println("FAIL[점수 미달] (총점 "+sum+")");
//		}else {
//			System.out.println("FAIL[점수 미달] (총점 "+sum+")");
//		}
	}

	public void method10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 메뉴출력");
		System.out.println("2. 짝수 / 홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass / Fail");
		System.out.println("선택 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			method4();
			break;
		case 5:
			method5();
			break;
		case 6:
			method6();
			break;
		case 7:
			method7();
			break;
		case 8:
			method8();
			break;
		case 9:
			method9();
			break;
		default:
			return;
		}
	}

}
