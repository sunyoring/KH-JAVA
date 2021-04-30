package com.kh.run;

public class HelloWorld {
	// 주석 : 소스코드와는 무관한 즉, 코드로 인식이 안됨 --> 주로 코드에 대한 설명을 작성하는데 사용
	/*전체 주석*/ //글을 적고 범위롤 지정해서 Ctrl+ Shift + /
	//한줄 주석 : Ctrl + /
	
	/*
	 * 1 2 3
	 */
	
	//public : 메인메소드는 외부에서 호출할 수 있다.
	//static : 객체를 생성하지 않고도 실행시킬 수 있다.
	//void : 반환값이 없을 때 사용.
	//String[] args : 파라미터, 매개변수-> 실행명령어 외에 인자를 받을 수있는데 스트링 배열로 들어간다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi~~~");

		System.out.println(args[0]);
		System.out.println(args[1]);
		
		System.out.print("안녕하세요 \n");
		System.out.print("반갑습니다.");
	}
	
}
