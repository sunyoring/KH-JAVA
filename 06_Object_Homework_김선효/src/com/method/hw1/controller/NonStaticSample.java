package com.method.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {

	public void printLottoNumbers() {
		int[] random = new int[6];
		
		for(int i =0; i<random.length; i++) {
			random[i] = (int)(Math.random() * 45) + 1;
			for(int j=0; j<i; j++) {
				if(random[i] == random[j]) {
					i--;
					break;
				}
			}
		}
	 Arrays.sort(random);
	 System.out.print("랜덤 값 : ");
	 for(int i =0; i<random.length; i++) {
		 System.out.print(random[i] + " ");
	 }
	 
	}

	public void outputChar(int nu, char c) {
		System.out.print(c + "문자 " + nu + "개 출력 : ");
		for (int i = 0; i < nu; i++) {
			System.out.print(c + " ");
		}
	}

	public char alphabette() {
		char random = ' ';
		for (int i = 0; i < 52; i++) {

			if (i < 26) {

				random = (char) (i + 65); // A~Z

			} else {

				random = (char) (i + 71); // a~z
			}
		}
		return random;
	}

	public String mySubstring(String str, int index1, int index2) {
		String strr = str.substring(index1, index2);
		if(str != null) {
			return str + "의 " + index1+"번 "+index2+"번 인덱스 사이의 값 출력 : " + strr;
		}else {
			return null;
		}
		
	}
}
