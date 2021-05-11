package com.kh.dimension;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DimensionalArray {

	// 이차원배열 : 일차원 배열 여러개를 하나로 묶은 것
	public void method1() {

		/*
		 * 1. 이차원 배열 선언 자료형 배열명[][]; 자료형[] 배열명[]; 자료형 배열명[][];
		 */

		int arr1[][];
		int[] arr2[];
		int[][] arr3;

		/*
		 * 2. 이차원 배열 할당 배열명 = new 자료형[행크기][열크기];
		 * 
		 */
		arr1 = new int[3][5];

		// 행의 길이
		System.out.println("행의 길이 : " + arr1.length);

		// 열의 길이
		System.out.println("열의 길이 : " + arr1[0].length);
		System.out.println("열의 길이 : " + arr1[1].length);
		System.out.println("열의 길이 : " + arr1[2].length);

		// *****
		// *****
		// *****

		// 바깥쪽 for문 --> 행의 갯수만큼 반복
		// 안쪽 for문 --> 열의 갯수만큼 반복
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print('*');
			}
			System.out.println();

		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				System.out.print(arr1[i][j] + " ");

			}
			System.out.println();
		}

	}

	public void method2() {
		int[][] arr = new int[3][5];

		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15

		// 값 기록
		// 1. 인덱스에 접근하여 값 기록
		/*
		 * arr[0][0]=1; arr[0][1]=2; arr[0][2]=3; arr[0][3]=4; arr[0][4]=5;
		 * 
		 * arr[1][0]=6; arr[1][1]=7; arr[1][2]=8; arr[1][3]=9; arr[1][4]=10;
		 * 
		 * arr[2][0]=11; arr[2][1]=12; arr[2][2]=13; arr[2][3]=14; arr[2][4]=15;
		 */

		// 2. 중첩 for문을 이용하여 값 기록
		int value = 1;

		for (int i = 0; i < arr.length; i++) {// 행을 지정해주는 for문
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}

		for (int i = 0; i < arr.length; i++) {// 행을 지정해주는 for문
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", +arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method3() {
		// 이차원 배열의 할당과 동시에 초기화

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < arr.length; i++) {// 행을 지정해주는 for문
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void method4() {
		// 가변배열
		// 행은 정해졌으나 각 행에 대한 열의 갯수가 정해지지 않은 상태
		// 자료형이 같은 1차원 배열 여러개를 하나로 묶은 것--->2차원 배열
		// 묶인 1차원 배열의 길이가 다를 수 있음.

		int[][] arr = new int[3][]; // 가변배열 할당(행의 크기는 3행)

		arr[0] = new int[2]; // 0행은 2열이다.
		arr[1] = new int[1]; // 1행은 1열이다.
		arr[2] = new int[3]; // 2행은 3열이다.

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		// 값 초기화
		// 1. 인덱스 접근

		/*
		 * arr[0][0] = 1; arr[0][1] = 2;
		 * 
		 * arr[1][0] = 3;
		 * 
		 * arr[2][0] = 4; arr[2][1] = 5; arr[2][2] = 6;
		 */

		// 2. 중첩 for문을 이용하여 값 기록
		int value = 1;

		for (int i = 0; i < arr.length; i++) {// 행을 지정해주는 for문
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}

	}

	public void method5() {
		// 가변 배열과 할당을 동시에 초기화
		int[][] arr = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}

	public void method6() {
		// Scanner를 이용해서 국어점수와 영어점수를 3번 찍어서 각각 합을 구하시오.
		double[][] arr = new double[2][4];
		Scanner sc = new Scanner(System.in);

		int arrILgth = 0;

		for (int i = 0; i < arr.length; i++) {

			double sum = 0;

			arrILgth = arr[i].length - 1;

			for (int j = 0; j < arr[i].length - 1; j++) {
				if (i == 0) {
					System.out.println("국어 점수 : ");
				} else {
					System.out.println("영어 점수 : ");
				}
				arr[i][j] = sc.nextDouble();

				sum += arr[i][j];
			}
			arr[i][arrILgth] = sum;
			System.out.println("합 ----->" + arr[i][arrILgth]);

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}

		DecimalFormat f1 = new DecimalFormat("0.00");
		System.out.println("국어점수 평균 : " + arr[0][arrILgth] / arrILgth);
		System.out.println("영어점수 평균 : " + arr[0][arrILgth] / arrILgth);

		System.out.println("영어점수 평균 : " + f1.format(arr[1][arrILgth] / arrILgth));

	}

	public void method7() {
		// 1부터 10사이의 랜덤값을 3행 3열에 값을 넣으려고 한다.
		// 중복 제거
		// 1차원 배열로 중복제거한 값 9개 구하고 2차원 배열로 셋팅

		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}
		
		int[][] arr2 = new int[3][3];

		int index = 0;
		
		for(int i = 0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = arr[index++];
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {

				System.out.print(arr2[i][j] + "\t");

			}
			System.out.println();
		}
	}
	
	public void bingo() {
		Scanner sc = new Scanner(System.in);
		
		//1차원 배열로 중복제거한 25개 값

		int[] temArr = new int[25];
		for(int i = 0; i<temArr.length; i++) {
			temArr[i] = (int)(Math.random()*25+1);
			
			for(int j =0; j<i; j++) {
				if(temArr[i] == temArr[j]) {
					i--;
					break;
				}
			}
		}
		
		int[][] newArr = new int[5][5];
		int index=0;
		for(int i =0; i<newArr.length; i++) {
			for(int j=0; j<newArr[i].length; j++) {
				newArr[i][j] = temArr[index++];
			}
		}
		
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {

				System.out.printf("%4d ",newArr[i][j]);

			}
			System.out.println();
		}
		
		int count = 0;
		System.out.println("=========빙고게임시작========");
		
		while(true) {
			
			System.out.println("정수를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			count++;
			
			for(int i =0; i < 5; i++) {
				for(int j =0; j < 5; j++) {
					
					if(newArr[i][j] == num) {
						newArr[i][j] = 0; //일치하는 위치에 0으로 표시.
					}
					
					System.out.printf("%4d ",newArr[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("게임을 끝내시겠습니까? y/n");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if(ch == 'Y') {
				break;
			}
		}
		System.out.println(count + "번 입력하였습니다.");
	}

}
