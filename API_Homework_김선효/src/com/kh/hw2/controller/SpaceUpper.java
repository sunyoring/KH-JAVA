package com.kh.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public SpaceUpper() {
		// TODO Auto-generated constructor stub
	}
	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력하시오(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		// 영문을 입력 받는다.
		// StringTokenizer를 통해 띄어쓰기를 기준으로 토큰 단위로 나온 것을 연산하는 메소드를
		// 띄어쓰기 이후 첫 글자는 대문자로 되게 하고 그 외에 나머진 소문자로 해서
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreElements()){
		str = st.nextToken();
		str = str.substring(0, 1).toUpperCase()+str.substring(1, str.length());
		sb.append(str);
		}
		System.out.println(sb);

}
}