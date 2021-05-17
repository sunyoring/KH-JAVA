package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] stu = new Student[3];

		stu[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		stu[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		stu[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		for (Student s : stu) {

			System.out.println(s.information());
		}

		Employee[] emp = new Employee[10];
		int count = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("신장 : ");
			double height = sc.nextDouble();
			System.out.println("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("급여 : ");
			int salary = sc.nextInt();
			System.out.println("부서 : ");
			sc.nextLine();
			String dept = sc.nextLine();
			emp[count++] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.println("계속 추가하십니까 ? (y/n)");

			char ch = sc.nextLine().charAt(0);
			if (ch == 'n') {
			break;
			}
			
		}
		for(int i =0; i<count; i++) {
			System.out.println(emp[i].information());
		}

	}
}
