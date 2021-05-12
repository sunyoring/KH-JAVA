package com.kh.chap04.field.model.vo;


//클래스변수 (static)에 대해 알아보기
public class FieldTest3 {

	//전역변수의 일종인 클래스 변수는 static 예약어가 붙은 변수
	
	//static -> 프로그램을 실행하자마자 static메모리 영역에 할당된다.
	//일반변수는 이 클래스로 객체를 생성해야만 그 변수 메모리에 올라간다면, static이 붙은 변수는 프로그램 실행과 동시에 메모리에 옮긴다.
	
	
	public static String pubsta = "public static";
	private static String prista = "private static";
	
	
	public FieldTest3() {
		// TODO Auto-generated constructor stub
	}
	
	//pubsta 는 접근제한자가 public이고, 언제 어디서든 접근 가능하므로 setter,gette가 불필요.
	//private 변수에 대해서만 만든다. 또, static예약어가 붙으면 메소드 또한 static를 붙여서 만든다.
	public static void setPrista(String prista) {
		// this.prista = prista; ---> static은 객체를 생성하지않고 프로그램 실행과 동시에 static영역에 할당되므로  this가 존재하지 않는다.
		FieldTest3.prista = prista;
	}
	
	// 
	public static String getPrista() {
		return prista;
	}
}
