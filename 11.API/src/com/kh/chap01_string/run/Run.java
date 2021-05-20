package com.kh.chap01_string.run;

public class Run {

	public static void main(String[] args) {
		//Run.method1();
		new Run().method2();
	}

	private void method2() {
		String str = "abc";
		
		// charAt(인덱스) : 문자 뽑아내기
		System.out.println(str.charAt(2));//c

		// concat : 문자열 합치기
		System.out.println(str.concat("def"));//abcdef
		
		// contains : 포함여부 확인하기
		System.out.println(str.contains("ab")); //true
		
		// equals : 동등여부 확인하기
		System.out.println(str.equals("abc"));//true
		
		// length : 문자열길이
		System.out.println(str.length()); //3
		
		// split : (특수한 기호를 기준으로 )문자를 구분하여 배열로 반환해줌
		String str1 = "a,bc,de";
	
		String[] strArr = str1.split(",");
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		//toUpeerCase : 대문자로
		//toLowerCase : 소문자로
		//equalsIngnoreCase : 대소문자 상관없이 문자열 비교(boolean)
		
		String strCase1 = "Abc";
		String strCase2 = "aBc";
		
		System.out.println(strCase1.toUpperCase());
		System.out.println(strCase2.toLowerCase());
		
		System.out.println(strCase1.equalsIgnoreCase(strCase2));
		
		//trim : 문자열 양쪽 공백을 제거
		String str2 = "		ab  c	";
		System.out.println(str2);
		System.out.println(str2.trim());
	}

	private static void method1() {
		//1.문자열을 리터럴으로 생성
		
		String str = "abc"; //heap 객체 생성 
		
		String str1 = "abc";
		
		String str2 = "def";
		
		//2. 문자열을 new 생성자()로 생성 //heap 객체 생성 
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		//값이 같으면 같은 곳을 가리킨다.
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		//new로 생성한 경우는 각각의 주소값을 가진다.
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}

}
