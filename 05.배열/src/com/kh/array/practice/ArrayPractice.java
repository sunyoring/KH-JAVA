package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmep = arr[i];
					arr[i] = arr[j];
					arr[j] = tmep;
				}
			}
			System.out.print(arr[i] + " ");

		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수  : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		String[] fruit = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(fruit[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열  : ");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		int count = 0;
		String index = "";

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		System.out.println("문자  : ");
		char ch2 = sc.nextLine().charAt(0);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ch2) {
				count++;
				index += " " + i;

			}
		}
		System.out.println(str + "에 " + ch2 + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(ch2 + " 개수 :" + count);
	}

	public void practice6() {
		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };
		Scanner sc = new Scanner(System.in);
		System.out.println("0~6사이의 숫자 입력  : ");
		int num = sc.nextInt();
		if (num < 0 || num > 6) {
			System.out.println("잘못입력");
		} else {
			System.out.println(arr[num]);

		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력  : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("총 합 : " + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {

			System.out.println("정수 : ");
			int num = sc.nextInt();
			int[] arr = new int[num];
			if (num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length / 2 + 1) {

						arr[i] = ++count;
					} else {
						arr[i] = --count;
					}
				}
			}
			System.out.println(Arrays.toString(arr));

		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] chickin = { "후라이드", "간장", "양념" };
		for (int i = 0; i < chickin.length; i++) {
			System.out.println("치킨 이름을 입력하세요 : ");
			String str = sc.nextLine();

			if (chickin[i].equals(str)) {
				System.out.println(str + "치킨 배달 가능");
			} else {
				System.out.println(str + "치킨은 없는 메뉴입니다.");
			}
		}
	}

	public void practice10() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

	}

	public void practice11() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		Arrays.sort(arr);
		System.out.println("\n최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);
	}

	public void practice12() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		char[] arr = new char[14];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (i >= 8) {
				arr[i] = '*';
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public void practice14() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}