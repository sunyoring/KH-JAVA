package com.kh.hw5.controller;

import java.util.Scanner;

public class NumberOk {

	private int ran;

	public NumberOk() {
		// TODO Auto-generated constructor stub
	}

	public void numGame() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			ran = (int) (Math.random() * 100 + 1);
			for (int i = 1; i <= 100; i++) {

				System.out.println("1부터 100 사이의 정수를 하나 입력하세요 : ");
				int num = sc.nextInt();
				if (num > ran) {
					System.out.println(num + "보다 작습니다." + i + "번째 실패");

				} else if (num < ran) {
					System.out.println(num + "보다 큽니다." + i + "번째 실패");

				} else {
					System.out.println(i + " 번 만에 맞췄습니다!");
					
					System.out.println("계속 하시겠습니까 ? ");
					sc.nextLine();
					String str = sc.nextLine();
					if (str.equalsIgnoreCase("Y")) {
						System.out.println("새로운 게임을 시작합니다 !");
						break;
					} else if (str.equalsIgnoreCase("N")) {
						System.out.println("게임을 종료합니다.");
						return;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
					}
				}

				
			}

		}

	}
}