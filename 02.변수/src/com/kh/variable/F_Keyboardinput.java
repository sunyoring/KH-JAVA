package com.kh.variable;

import java.util.Scanner;

public class F_Keyboardinput {
	
	
	public void inputScanner1() {
		
		Scanner sc = new Scanner(System.in);//System.in ->입력값을 byte단위로 받아들임.
		
		System.out.println("당신의 이름은 무엇입니까 : ");
		
	// 	사용자가 입력한 값을 문자열로 받아오는 메소드(next(), nextLine())
		
	//	String name = sc.next(); //공백이 있는 경우 공백 이전까지 읽어옴.
		String name = sc.nextLine(); //사용자가 입력한 값 모두 읽어온다.
		
		System.out.println("당신의 나이는 몇 살 입니까 : ");
		int age = sc.nextInt(); //사용자가 입력한 정수에 대한 값을 읽어온다.
		
		System.out.println("당신의 키는 몇 입니까 : ");
		double height = sc.nextDouble(); //사용자가 입력한 실수에 대한 값을 읽어온다.
		
		System.out.println(name + "님은 " + age + "세이며, 키는 " + height + "cm 입니다."); 
		
	}
}
