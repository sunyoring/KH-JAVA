package com.kh.variable;

public class B_Constant {
	
	public void finalConstant() {
		int age = 20;
		System.out.println("age : " + age);
		
		age = 30;
		System.out.println("변경 된 age : " + age);
		
		final int AGE = 20;
		System.out.println("AGE : " + AGE);
		
//		AGE = 30; 오류 발생 -> 상수는 한번 지정된 값을 변경할 수 없다.
	}
}
