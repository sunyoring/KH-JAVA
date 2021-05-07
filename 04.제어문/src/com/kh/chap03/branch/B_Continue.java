package com.kh.chap03.branch;

public class B_Continue {
	// continue : 반복문안에서만 사용가능하며 continue를 만나면 그 다음 구문을 실행하지 않고 가장 가까운 반복문으로 올라가라는
	// 의미.

	public void method1() {
		// 1부터 10까지 홀수를 출력

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				// continue; 아래의 문장은 실행되지 않는다.
				System.out.print(i + " ");
			}
		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue; // 뒤의 출력문을 실행하지 않고 반복문 증감식으로 올라간다.
			}
			System.out.print(i + " ");
		}

	}

	public void method2() {
		// 1부터 100까지의 정수들의 합 출력
		// 단 6의 배수는 제외하고 덧셈연산

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue;
			}
			sum += i;

		}
		System.out.println("1부터 100까지 정수들의 합 : " + sum);
	}

	public void method3() {
		// 2~9단까지의 구구단 출력 중 4의 배수 단은 제외

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 4 == 0) {
					continue;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();

		}
	}

	public void method4() {

		// 2~9단 출력, 단 짝수 곱 제외

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j % 2 == 0) {
					continue;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();

		}
	}

}
