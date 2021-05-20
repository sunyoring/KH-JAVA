package com.kh.chap03_stringTokenizer.run;

import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		//StringTokenizer
		//:String(문자열)을 어떤 특수기호를 기존으로 Token 단위로 나눠서 처리할 때 ㅆ읨
		//split 메소드로 유사하나 split 메소드를 쓰면 String배열로 처리, StringTokenizer는 자체 클래스로 저장

		
		String str = "김남길,유산슬,유야호,카놀라유,로운";
		StringTokenizer st = new StringTokenizer(str,",");
		
		System.out.println(st.countTokens()); //토큰의 갯수 리턴
		
		int i = 0;
		while(st.hasMoreTokens()) {//커서 다음에 토큰이 있는지 확인한다.
			String whStr = st.nextToken();//문자열을 하나씩 가져온다.
			System.out.println(whStr);
			System.out.println(st.countTokens()); 
		}
	}

}
