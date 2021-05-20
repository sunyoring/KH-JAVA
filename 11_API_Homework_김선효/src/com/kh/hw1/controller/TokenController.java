package com.kh.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuffer sb = new StringBuffer();
		String wStr = "";
		int i = 0;
		while (st.hasMoreTokens()) {
			wStr += st.nextToken();

		}
		return wStr;

	}

	public String firstCap(String str) {
		String a = str.substring(0, 1).toUpperCase();
		String b = str.substring(1);
		String result = a + b;
		
		
		return result;
	}

	public int findChar(String input, char one) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}
}
