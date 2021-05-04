package com.kh.operator;

public class C_Arithmetic {
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2)); //곱
		System.out.println("num1 / num2 = " + (num1 / num2)); //나누기 몫
		System.out.println("num1 % num2 = " + (num1 % num2)); //나누기 나머지
		
		//값 % 2 == 0 ---> 짝수
		//값 % 2 == 1 ---> 홀수
		
		
		//값 % 5 == 0 ---> 5의 배수
	}
	
	public void method2() {
		double a = 35;
		double b = 10;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		double sum = a + b ;
		System.out.println("a + b = " + sum);
		
		double sub = a - b;
		System.out.println("a - b = " + sub);
		
		double mul = a * b;
		System.out.println("a * b = " + mul);
		
		double div = a / b;
		System.out.println("a / b = " + div);

		double mod = a % b ;
		System.out.println("a % b = " + mod);
		
		int c = 27;
		System.out.println("c = " + c);
		
		double result = a + a*b % c - a/b;
		System.out.println("result = " + result);
		/*1. a*b = 350.0
		 *2. 350.0 % c = 26.0
		 *3. a/b = 3.5
		 *4. a + 26.0 - 3.5 = 57.5 */
	}
	public void method3() {
		int a = 5;
		int b = 10;
		int c =(++a) + b; // a=6,b=10,c=16
		int d =c/a; //d = 2
		int e = c%a; // e = 4
		int f = e++; // f = 4 e = 5
		int g= (--b) + (d--); // g = 11 d = 1 b = 9
		int h =2 ;
		int i = a++ + b/(--c/f) * (g-- -d) % (++e +h); // i = 12 a = 6(7) g = 11(10) e = 6// g = 10 // c = 15 //
		// = 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2);
		// = 6 + 9 / 3        *  10      %  8  
		// = 6
		
		System.out.println("a : " + a); // 6
		System.out.println("b : " + b); // 9
		System.out.println("c : " + c); // 15
		System.out.println("d : " + d); // 1
		System.out.println("e : " + e); // 6
		System.out.println("f : " + f); // 4
		System.out.println("g : " + g); // 10
		System.out.println("h : " + h); // 2
		System.out.println("i : " + i); // 12
		
	}
}
