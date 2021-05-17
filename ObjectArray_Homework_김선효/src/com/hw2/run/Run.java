package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] s = new Student[10];
		int count = 0; // 학생 수

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("학년 : ");
			int grade = sc.nextInt();
			System.out.println("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("국어점수 : ");
			int kor = sc.nextInt();
			System.out.println("영어점수 : ");
			int eng = sc.nextInt();
			System.out.println("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();

			s[count++] = new Student(grade, classroom, name, kor, eng, math);
			
			System.out.println("계속 추가하시겠습니까 ? (y/n) ");
			char ch = sc.nextLine().charAt(0);
			if (ch == 'n' || ch == 'N') {
				break;
			}

		}
		for (int i = 0; i < count; i++) {
			System.out.println(s[i].information());
		}

	}

}
