package com.kh.run;

import com.kh.first.A_MethodPrinter;

public class RunA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		//패키지명까지 풀클래스명으로 사용하는 방법
		
		// Ctrl + Shift + O -> import단축키 , Ctrl + Space -> 자동완성기능
		A_MethodPrinter a = new A_MethodPrinter(); //클래스명만 가지고 생성하되 import 구문을 추가해아한다.
	
		/*
		 * a.methodA(); //사용할 이름.메소드명()으로  호출
		a.methodB();
		a.methodC();
		*/
		
		a.methodA();
	}

}
