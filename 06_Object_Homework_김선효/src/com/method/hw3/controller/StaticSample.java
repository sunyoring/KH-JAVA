package com.method.hw3.controller;

public class StaticSample {
	private String value;

	public StaticSample() {
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void toUpper() {
		
		char[] ch = new char[value.length()];
		String str = "";
		for(int i = 0; i <ch.length; i++) {
			 ch[i] = value.toUpperCase().charAt(i);
			 str +=ch[i];
		}
		value = str;
	}



	public void setChar(int index, char c) {
		char[] ch = new char[5];
		String str="";
		for(int i = 0; i < value.length(); i++) {
			ch[i] = value.charAt(i);
			if(i==index) {
				ch[i] = c;
			}
			str += ch[i];
		}
		value = str;
	}

	public int valueLengh() {
		int vl = value.length();
		return vl;
	}

	public String valueConcat(String str) {
		String subString = str + value;
		return subString;
	}
}
