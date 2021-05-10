package com.kh.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D_Overlap {

//중복 제거
	public void method1() {
		int[] arr= new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(i + "번째 정수 값 : ");
			arr[i] = sc.nextInt();
			for(int j = 0; j< i; j++) {
				System.out.println(i + "  " + j);
				if(arr[i] == arr[j]) {
					System.out.println("중복값이 존재합니다.");
					i--; //i를 감소시켜서 전 단계를 다시 실행시켜준다. 
					break; //가장 가까운 for문 탈출
				}
			}
		}
		
		for(int i =0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	public void method2() {
		int[] arr = new int[5];
		
		//임의의 1부터 10사이의 난수를 발생시켜서 중복없이 출력.
	
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);

			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method3() {
		//배열 10칸, 난수 100, 중복 제거, 오름차순
		
		int[] arr = new int[10];
		for(int i = 0; i< arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);

			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		//오름차순 정렬
		Arrays.sort(arr); //내림차순은 제공하지 않는다.
		System.out.println(Arrays.toString(arr));
		
		//내림차순 정렬
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmep = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmep;
                }
            }
        }
		System.out.println(Arrays.toString(arr));




	}



}
