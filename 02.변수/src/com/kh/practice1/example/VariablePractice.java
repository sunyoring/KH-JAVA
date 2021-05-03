package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		
		System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^\n",height,age,gender,name);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1+num2));
		System.out.println("빼기 결과 : "+ (num1-num2));
		System.out.println("곱하기 결과 : "+ (num1*num2));
		System.out.println("나누기 몫 결과 : "+(num1/num2));

	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 : ");
		double width = sc.nextDouble();
		System.out.println("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("면적 : " + (width*height));
		System.out.println("면적 : " + (width+height)*2);

	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
	}
	
	

}
