package com.kh.hw4.controller;

import java.util.Scanner;

import com.kh.hw4.model.vo.Employee;

public class EmpTest {

	private Employee[] empArr = new Employee[6];
	private Scanner sc = new Scanner(System.in);

	public EmpTest() {
		// TODO Auto-generated constructor stub
	}

	public void setEmp() {

		for (int i = 0; i < empArr.length; i++) {
			System.out.println("이름 : ");
			if(i>0) {
				sc.nextLine();
			}
			String name = sc.nextLine();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("급여 : ");
			int salary = sc.nextInt();
			System.out.println("세율 : ");
			double taxRate = sc.nextDouble();

			empArr[i] = new Employee(name, age, salary, taxRate);

		}
	}

	public void printEmp() {
		for (Employee e : empArr) {
			System.out.println(e.toString());
		}
	}
	
	public void nameSortPrint() {
		Employee[] copy = empArr.clone();
		Employee temp = null;
		for(int i = 0; i<copy.length; i++) {
			for(int j = 1; j<i; j++) {
				if(((copy[i].getName()).compareTo(copy[j].getName())) == 1) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = copy[i];
				}
			}
		}
		for (Employee e : copy) {
			System.out.println(e.toString());
		}
		
	}

}
