package com.kh.chap07_method.part01_methodTest.run;

import com.kh.chap06_constructor.model.vo.User;
import com.kh.chap07_method.part01_methodTest.controller.NonStaticMethod;
import com.kh.chap07_method.part01_methodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
		
		
		//---------------NonStaticMethod test-----------------
		NonStaticMethod a = new NonStaticMethod();
		
		//1. 매개변수와 반환값이 없는 메소드 호출
		a.method1();
		
		//2.매개변수가 없고 반환값이 있는 메소드 호출
		//---> 반환되는 값을 기록하기 위한 변수를 작성해서 받아줌.
		String str = a.method2();
		System.out.println("str : " + str);

		//3.매개변수가 있고 반환값이 없는 메소드
		//반드시 전달되는 값은 매개변수의 타입의 순서와 개수가 일치하는 값을 넣어준다.
		a.method3(10, 20);
		
		//4.매개변수가 있고 반환값도 있는 메소드
		int result = a.method4(10, 20);
		System.out.println("result : " + result);
		
		User u1 = new User("user01","pass01","김남길");
		System.out.println(u1.information());
		a.method(u1);
		System.out.println(u1.information());
		
		
		
		//---------------StaticMethod test-----------------

		//객체를 생성할 필요 없음 --->이미 프로그램 시작시 올라가 있다.
		//클래스명.메소드명([전달값]);
		StaticMethod.method1();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("이효리");
		System.out.println(StaticMethod.method4("전지현"));
	}

}
