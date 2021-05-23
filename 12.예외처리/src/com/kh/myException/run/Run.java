package com.kh.myException.run;

import java.util.Scanner;

import com.kh.myException.exception.MyException;

public class Run {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요 : ");
		
		int num = sc.nextInt();
		
		try {
			checkNum(num);//예외처리

		}catch(MyException e) {
			e.printStackTrace();
		}
	}

	//checkNum

	//10보다 작은 수일 경우 : MyException("10 보다 작은 수 입니다.") 발생 시킴
	//아닌경우 sysout :  10보다 크거나 같은 수이다
	
	private static void checkNum(int num) throws MyException {
		if(num < 10) 
			throw new MyException(num + "은 10보다 작은 수입니다.");
		else {
			System.out.println("10보다 크거나 같은 수이다.");
			}
			
	}
	

}
