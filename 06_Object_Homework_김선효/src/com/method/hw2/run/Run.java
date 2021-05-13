package com.method.hw2.run;

import java.util.Arrays;

import com.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		NonStaticSample n = new NonStaticSample();
		n.intArrayAllocation(5);
		int[] arr = Arrays.copyOf(n.intArrayAllocation(5), 5);
		System.out.print("배열의 크기가 5인 배열의 랜덤값 : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		n.sortDescending(arr);
		n.sortAscending(arr);
		System.out.println("apple 문자열에  p 의 갯수 : " + n.countChar("apple", 'p'));
		System.out.println("13과 7사이 정수들의 합계 : " + n.totalValue(13, 7));
		System.out.println("programming문자열의 3번 인덱스 문자 : " + n.pCharAt("programming", 3));
		System.out.println("JAVA와 programming을 합친 문자열 : " + n.pConcat("JAVA", "programming"));
	}
}