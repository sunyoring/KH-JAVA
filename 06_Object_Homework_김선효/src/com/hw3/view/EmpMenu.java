package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {

  
	public EmpMenu() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {
	
		Employee emp = null;
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력 ");
			System.out.println("2. 사원 정보 수정 ");
			System.out.println("3. 사원 정보 삭제 ");
			System.out.println("4. 사원 정보 출력 ");
			System.out.println("9. 프로그램 종료 ");

			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1 :
				emp = inputEmployee();
				break;
			case 2:
				modifyEmployee(emp);				
				break;
			case 3:
				emp = null;
				break;
			case 4:
				if(emp != null) {
					System.out.println(emp.information());
				}else {
					System.out.println("정보 없음");
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			}
		}

	}

	

	private Employee inputEmployee() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름 : ");
		String empName = sc.nextLine();
		
		System.out.println("부서 : ");
		String dept = sc.nextLine();
		
		System.out.println("직급 : ");
		String job = sc.nextLine();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("급여 : ");
		int salary = sc.nextInt();
		
		System.out.println("보너스 : ");
		double bonusPoint = sc.nextDouble();

		sc.nextLine();
		System.out.println("번호 : ");
		String phone = sc.nextLine();
		
		System.out.println("주소 : ");
		String address = sc.nextLine();
		
		
		
		return new Employee(empName,dept,job,age,gender,salary,bonusPoint,phone,address);
	}
	
	private void modifyEmployee(Employee emp2) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===== 사원 정보 수정 메뉴 =====");
			System.out.println("1. 이름 변경 ");
			System.out.println("2. 급여 변경 ");
			System.out.println("3. 부서 변경 ");
			System.out.println("4. 직급 변경 ");
			System.out.println("9. 이전 메뉴로 ");

			int num = sc.nextInt();

			switch (num) {
			case 1:
				sc.nextLine();
				System.out.println("이름 : ");
				String name = sc.nextLine();
				emp2.setEmpName(name);
				break;
			case 2:
				System.out.println("급여 : ");

				int salary = sc.nextInt();
				emp2.setSalary(salary);
				break;
			case 3:
				sc.nextLine();
				System.out.println("부서 : ");

				String dept = sc.nextLine();
				emp2.setDept(dept);
				break;
			case 4:
				sc.nextLine();
				System.out.println("직급 : ");

				String job = sc.nextLine();
				emp2.setDept(job);
				break;
			case 9:
				return;
			}

		}
	}
}
