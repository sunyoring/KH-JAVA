package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		int[][] arr = new int[4][4];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}

	public void practice2() {

		int[][] arr = new int[4][4];
		int num = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}

	}

	public void practice3() {
		String[][] arr = new String[3][3];
		int n = 0;
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				n = i;
				m = j;
				arr[i][j] = "(" + n + "," + m + ")";

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);

				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];

				arr[3][3] += arr[i][j];

			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("행 크기 : ");
			int n = sc.nextInt();

			System.out.println("열 크기 : ");
			int m = sc.nextInt();

			if (n > 10 || n < 0 || m < 0 || m > 10) {
				System.out.println("반드시 1~10 사이의 정수로 입력!");
				continue;
			}else {
				
			}
			char[][] arr = new char[n][m];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (char)(Math.random() * 26 + 65); 
					// (int)Math.random()+n --> 0부터 n아래까지의 숫자이므로 원하는 범위가 있다면 (최대값-최소값)곱해준 후 최소값을 더해다.
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {

					System.out.print(arr[i][j] + "\t");

				}
				System.out.println();
			}

		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.println("행의 크기 :");
		int n = sc.nextInt();
		char[][] arr = new char[n][];
		int m = 0;

		for (int i = 0; i < arr.length; i++) {// 행을 지정해주는 for문
			System.out.println(i + "행의 크기");
			m = sc.nextInt();
			arr[i] = new char[m];
		}
		char c = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = c++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}

	public void practice8() {
		String[] arr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int index = 0;
		System.out.println("====1분단=====");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = arr[index++];
				System.out.print(arr1[i][j] + " ");

			}

			System.out.println();
		}
		System.out.println("====2분단=====");

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[2].length; j++) {
				arr2[i][j] = arr[index++];
				System.out.print(arr2[i][j] + " ");

			}
			System.out.println();

		}

	}

	public void practice9() {
		String[] arr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int index = 0;
		System.out.println("====1분단=====");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = arr[index++];
				System.out.print(arr1[i][j] + " ");

			}

			System.out.println();
		}
		System.out.println("====2분단=====");

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[2].length; j++) {
				arr2[i][j] = arr[index++];
				System.out.print(arr2[i][j] + " ");

			}
			System.out.println();

		}

		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생 이름 입력 : ");
		String name = sc.nextLine();
		String a;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (name.equals(arr1[i][j])) {

					if (j == 0) {
						a = "왼쪽";
					} else {
						a = "오른쪽";
					}
					String result = "검색하신 " + name + " 학생은 1분단 " + (j + 1) + "번째 줄" + a + "에 있습니다.";
					System.out.println(result);
				} else if (name.equals(arr2[i][j])) {
					if (j == 0) {
						a = "왼쪽";
					} else {
						a = "오른쪽";
					}
					String result = "검색하신 " + name + " 학생은 2분단 " + (j + 1) + "번째 줄" + a + "에 있습니다.";
					System.out.println(result);
				}

			}
			System.out.println();
		}
	}

}
