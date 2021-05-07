package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	// break : 가장 가까운 반목문을 빠져나가는 문구
	// 단, switch문 안의 break는 switch문을 빠져나간다.

	public void method1() {
		// 사용자에게 문자열을 입력받고 문자열 길이 출력하기
		// 단, 사용자가 입력한 문자열이 exit일 경우 반복을 종료한다.

		Scanner sc = new Scanner(System.in);

		/*
		  for문 무한반족 
		  
		  for(;;) {
		   System.out.println("문자열 입력 : "); String str =
		   sc.nextLine(); System.out.println("str : " + str); 
		  }
		 */

		/*
		  while문 무한 반복 
		  
		  while(true) {-->조건식을 적어줘야 함. 
		   System.out.println("문자열 입력 : ");
		   String str = sc.nextLine(); System.out.println("str : " + str); 
		  }
		 */

		while (true) {
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			System.out.println("str : " + str);
			if (str.equals("exit")) {
				break;
			}
			System.out.println("문자열 길이 출력 : " + str.length());
		}
		
		//무한반복문안에서 break가 없는 경우  오류 발생. -> unreachable code 절대 도달할 수 없는 코드.
		System.out.println("프로그램 종료");
	}

	public void method2() {
		//매번 반복적으로 랜덤값(1~10)을 발생시킨 후 출력
		//단, 그 랜덤 값이 홀수일 경우 출력하지 않고 반복문을 빠져나간 후 "프로그램 종료" 출력
		while(true) {
			int random =(int)(Math.random()*10+1);
			if(random%2==1) {
				break;
			}
			System.out.println("랜덤 값 : " + random);
			
		}System.out.println("프로그램을 종료합니다.");
	}

	public void method3() {
		//사용자에게 반복적으로 정수 2개와 연산 기호(문자) + ,- 를 입력받고 그에 해당하는 계산을 처리하시오
		//단, 제시된 연산기호를 입력하지 않고 다른 연산기호를 입력했을 경우 빠져나가도록 한다.
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("정수1 입력 : ");
			int num1 = sc.nextInt();

			System.out.println("정수2 입력 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("연산 기호 입력(+,-) : ");
			char ch = sc.nextLine().charAt(0);
			int result = 0; 
			
			if(ch == '+') {
				result = num1+ num2;
			}else if(ch == '-') {
				result = num1 - num2;
			}else {
				System.out.println("잘못입력하였습니다.");
				break;
			}
//			switch(ch) {
//			case '+' : result = num1+ num2;
//			break;
//			case '-' : result = num1 - num2;
//			break;
//			default : return; 
//			}
			System.out.println(num1+" " + ch +" "+num2+ " = " + result);
				
		}
	

	}

}
