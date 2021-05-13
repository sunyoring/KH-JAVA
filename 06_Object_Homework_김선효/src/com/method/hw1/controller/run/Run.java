package com.method.hw1.controller.run;

import com.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
	NonStaticSample s =	new NonStaticSample();
	s.printLottoNumbers();
	s.outputChar(5, '굿');
	System.out.print("랜덤 영문자 출력 : ");
	System.out.println(new NonStaticSample().alphabette());
	System.out.println(s.mySubstring("apple",2,4)
);
	}

}
