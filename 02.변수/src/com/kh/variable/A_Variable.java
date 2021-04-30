package com.kh.variable; //같은 패키지 내에서는 같은 클래스명이 존재할 수 없음. 다른 패키지라면 에러 발생x

public class A_Variable {
	// 변수란 : 어떠한 값을 메모리에 기억하기 위한 공간이다 (박스같은개념)
		/* 변수를 사용하는 이유 :
		 * 변수는 우선적으로 값에 의미를 부여하기위한 목적으로 사용 한다. (가독성이 좋아짐)
		 * 또한 한 번 값을 저장해두고 계속 사용할 목적으로 사용된다. 
		 * 
		 * -> 유지보수를 쉽게 하기위한 목적
		*/
	
	public void printValue() {
		
		System.out.println("변수사용 전");
		System.out.println(2 * 3.14159265165 * 10);
		System.out.println(3.14159265165 * 10 * 10);
		System.out.println(3.14159265165 * 10 * 10 * 20);
		System.out.println(4 * 3.14159265165 * 10 * 10);
		
		double pi = 3.14159265165;
		int r = 10;
		int h = 20;
		
		
		System.out.println("변수사용 후");
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);

	}
	
	
	public void declareVariable() {
		/*
		 * 변수의 선언 (저장할 값을 기록하기 위한 변수를 메모리 공간에 확보해놓는 과정) == 변수(박스)만들겠다!! 
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 대해 변수(박스)의 크기 및 모양을 정하는 부분
		 * 변수명 : 변수(박스)의 이름을 정하는 부분 (의미부여) -> 여기서 지정한 이름으로 앞으로 호출
		 * 
		 * 주의할점
		 * - 변수명은 반드시 첫 문자가 소문자여야된다. 
		 * - 하지만 여러단어로 엮어 있는경우 연결되는 단어의 첫글자는 대문자 
		 * - 동일한 변수명으로 선언 불가
		 * - 해당 영역({})에 선언한 변수는 해당 지역 안에서만 꺼내 쓸수 있다. (다른 메소드에서는 사용 불가)
		 *   == 지역변수 개념
		 * 
		 */
		
		
		//자료형에 대한 개념
		//1. 논리형
		boolean isTrue; //true,false,1,0 //1byte
		
		//2. 숫자형
		//2_1 정수형
		
		byte bNum;		// 1byte
		short sNum;		// 2byte
		int iNum;		// 4byte  --> 정수형 중 가장 대표적인 자료형(기본형) -21억~21억 정도 범위의 값이 담긴다.
		long lNum;		// 8byte
		
		//2_2 실수형
		float fNum; 	// 4byte
		double dNum;	// 8byte --> 실수형 중 가장 대표적인 자료형(기본형) 
		
		
		//3. 문자형
		char ch;		// 2byte
		
		
		//------------------------------- 기본자료형 8가지 ------------
		
		//4.문자열 (참조자료형)
		String str;
		
		
		/* 변수에 값 대입
		 * 위에서 값을 담기위한 공간을 확보했다면 해당 변수에 값 대입 가능
		 * 
		 * [표현법] 변수명 = 값(리터럴);
		 * */
		
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 5;
		lNum = 8L; // 소문자 l을 안붙이는 이유는 가독성이 떨어지기 때문이다.
		
		fNum = 4.0f; //반드시 소문자 f를 붙임.
		dNum = 8.0; //기본형이기 때문에 d를 붙이지 않아도 된다.
		
		ch = 'A'; //따옴표를 사용하여 값 대입.
		//ch = 'ABC'; // 문자에는 한 문자 값만 저장됨.
		ch = '강';
		
		str = "ABC";
		str = "A"; //한 개의 문자만 쓰더라도 쌍따옴표를 이용.

		
		//변수에 담긴 값 호출하여 출력
		System.out.println("isTrue 의 값 " + isTrue);
		System.out.println("bNum 의 값 " + bNum);
		System.out.println("sNum 의 값 " + sNum);
		System.out.println("iNum 의 값 " + iNum);
		System.out.println("lNum 의 값 " + lNum);
		System.out.println("fNum 의 값 " + fNum);
		System.out.println("dNum 의 값 " + dNum);
		System.out.println("ch 의 값 " + ch);
		System.out.println("str 의 값 " + str);
		
	}
	
	public void initVariable() {
		
		/*
		 * 변수 선언과 동시에 초기화(= 값 대입)
		 *  [표현법] 자료형 변수명 = 값;
		 */
		
		boolean isTrue = true;
		byte bNum = 1;
		short sNum = 2;
		int iNum = 5;
		long lNum = 8L; // 소문자 l을 안붙이는 이유는 가독성이 떨어지기 때문이다.
		
		float fNum = 4.0f; //반드시 소문자 f를 붙임.
		double dNum = 8.0; //기본형이기 때문에 d를 붙이지 않아도 된다.
		
		char ch = 'A'; //따옴표를 사용하여 값 대입.
	
		String str = "B오후반";
		
		
		//변수에 담긴 값 호출하여 출력
		System.out.println("isTrue 의 값 " + isTrue);
		System.out.println("bNum 의 값 " + bNum);
		System.out.println("sNum 의 값 " + sNum);
		System.out.println("iNum 의 값 " + iNum);
		System.out.println("lNum 의 값 " + lNum);
		System.out.println("fNum 의 값 " + fNum);
		System.out.println("dNum 의 값 " + dNum);
		System.out.println("ch 의 값 " + ch);
		System.out.println("str 의 값 " + str);
		
		
		//변수 명명 규칙
		
		int number;
		
		// 1) 변수명이 같으면 에러발생
		// int number;
		
		// 2) 대소문자 구분
		int nUmber;
		
		// 3) 예약어 (이미 자바에서 사용되고 있는 키워드)를 사용하면 에러발생
		
		//int true;
		//int class;
		//int void;
		
		//4)숫자 가능(단, 숫자로 시작하는 것은 안됨)
		
		//int 1age;
		
		//5)특수문자가능(단, _ $ 이외의 특수문자는 사용불가)
		
		int number_1;
		int number$2;
		
//		int number#1;
		
		// 여러 단어로된  변수명인 경우 붙여쓰고 첫글자는 소문자, 연결되는 단어의 첫글자는 대문자
		
		String username;  //관례상x
		String userName;  //
		
		String 이름; //한글도 잘 사용하지 않음. 오류발생 가능성
		
		
		/*
		 * 정리
		 * 변수 : 리터럴(값) 을 저장하기위한 공간(메모리에 값을 기록하기위한 공간)
		 * 값 : 프로그램상에 필요한 명시적인 값 / 또는 사용자가 마우스 또는 기보드로 입력한 값
		 * 
		 * */
		
		
	}
	

public void test() {
	
	boolean v1 = false;
	char  v2 = '가';
	double v3 = 3.14;
	int v4 = 30;
	String v5 = "aaa";
	
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);
	System.out.println(v4);
	System.out.println(v5);
	
}

}
