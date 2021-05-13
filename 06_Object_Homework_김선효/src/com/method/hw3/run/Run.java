package com.method.hw3.run;

import com.method.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {
		StaticSample s = new StaticSample();
		s.setValue("Java");
		System.out.println(s.getValue());
		s.toUpper();
		System.out.println("대문자로 : " + s.getValue());
		System.out.println("길이 : " + s.valueLengh());
		System.out.println("PROGRAMMING 붙여서 : " + s.valueConcat("PROGRAMMING"));
		s.setChar(0, 'C');
		System.out.println("J => C : "+s.getValue());
	}

}
