package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 : ");
		char ch = sc.next().charAt(0);

		System.out.println(ch + " Unicode : " + (int) ch);
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 : ");
		double str1 = sc.nextDouble();

		System.out.println("영어 : ");
		double str2 = sc.nextDouble();

		System.out.println("수학 : ");
		double str3 = sc.nextDouble();

		int sum = (int) (str1 + str2 + str3);
		int avg = sum / 3;

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;

		float fNum = 3.0f;

		double dNum = 2.5;

		char ch = 'A';

		System.out.println((iNum1 / iNum2)); // 2
		System.out.println((int)dNum); // 2

		System.out.println(iNum2 * dNum); // 10.0
		System.out.println((double) iNum1); // 10.0

		System.out.println((double)iNum1 / iNum2); // 2.5
		System.out.println(dNum); // 2.5

		System.out.println((int) fNum); // 3
		System.out.println((iNum1 /(int)fNum)); // 3

		System.out.println((iNum1)/fNum); //
		System.out.println( iNum1 / (double)fNum);//

		System.out.println(ch); // 'A'
		System.out.println((int) ch); // 65
		System.out.println((int) ch + iNum1);// 75
		System.out.println((char)(ch + iNum1));// K

	}

}
