package com.method.hw2.controller;

import java.util.Arrays;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 100 + 1);

		}

		return arr;
	}

	public void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void swap(int[] arr, int idx1, int idx2) {
		int tmep = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmep;

	}

	public void sortDescending(int[] arr) {
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {

					swap(arr, i, j);
				}
			}
		}
		System.out.print("내림차순 : ");

		display(arr);
	}

	public void sortAscending(int[] arr) {
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					swap(arr, i, j);
				}
			}
		}
		System.out.print("오름차순 : ");
		display(arr);
	}

	public int countChar(String str, char ch) {
		System.out.println();
		int count = 0;

		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
			count++;
			}
		}
		return count;

	}

	public int totalValue(int num1, int num2) {
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		int result = 0;
		for(int i = min+1; i<max; i++) {
			result += i;
		}
		
		return result;
	}

	public char pCharAt(String str, int index) {
		char ch = str.charAt(index);
		
		return ch;
	}

	public String pConcat(String str1, String str2) {
		String result = str1+str2;
		return result;
	}
}
