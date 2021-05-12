package com.kh.chap04.field.run;

import com.kh.chap04.field.model.vo.FieldTest2;
import com.kh.chap04.field.model.vo.FieldTest3;
import com.kh.chap04.field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
		
		//----------1.FieldTest1
		
//		FieldTest1 f1 = new FieldTest1();
//		f1.test(20);
		
		
		//----------2.FieldTest2
		FieldTest2 f2 = new FieldTest2();
		//public --> 어디서든 접근 가능
		System.out.println(f2.pub);
	
		//protected --> 같은 패키지 내, 상속구조에서만 접근가능
//		System.out.println(fr.pro); -->다른 패키지이면서 상속구조가 아니기 때문에 접근 불가
		System.out.println(f2.getPro()); //getter 메소드를 통해 값을 알아올 수 있다.
		
		//default -->같은 패키지 내에서만 접근 가능
//		System.out.println(f2.def); --->다른 패키지이기때문에 에러.
		System.out.println(f2.getDef()); //getter 메소드를 통해 값을 알아올 수 있다.
		
		//private --> 같은 클래스 내에서만 접근 가능
//		System.out.println(fe.pri); --->
		System.out.println(f2.getPri());
		
		//----------3.FieldTest3
		
		//FieldTest f3 = new FieldTest3();
		
		System.out.println(FieldTest3.pubsta); //객체 생성필요없이 파로 클래스명. 으로 접근 가능
		
		//private static
		//sysoutm.out.println(FieldTest.prista);//private 이기 때문에 바로 접근 불가
		System.out.println(FieldTest3.getPrista());
		
		
		//----------4.FieldTest4
		
		System.out.println(FieldTest4.NUM);//객체 생성 필요 없이 바로 클래스명. 으로 접근가능
		
		System.out.println(Math.PI); 

	}

}
