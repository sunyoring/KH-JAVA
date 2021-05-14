package com.kh.part02.personMVC.view;

import java.util.Scanner;

import com.kh.part02.personMVC.controller.PersonController;
import com.kh.part02.personMVC.model.vo.Person;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		while (true) {
			System.out.println("======= 메뉴 =======");
			System.out.println("1. 회원추가");
			System.out.println("2. 회원 전체 조회");
			System.out.println("3. 회원 이름 검색");
			System.out.println("4. 회원 평균 재산 조회");
			System.out.println("9. 프로그램종료");
			System.out.println("메뉴 선택 : ");

			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				inserPerson();
				break;
			case 2:
				printPeson();

				break;
			case 3:
				searchPerson();
				break;
			case 4:
				System.out.println("평균재산  + " + pc.avgWealth());
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				break;
			}
		}
	}

	private void searchPerson() {
		System.out.println("=== 회원 이름 검색 ===");
		
		System.out.println("검색할 이름 : ");
		String search = sc.nextLine();
		
		Person searchPeroson = pc.searchPeroson(search);
		if(searchPeroson == null) {
			System.out.println("검색 된 사람이 없습니다.");
		}else {
			System.out.println(searchPeroson.information());
		}
	}

	private void printPeson() {
		System.out.println("=== 회원 정보 조회 ===");
		int cnt = pc.getCount(); // 현재 회원수
		if (cnt == 0) {
			System.out.println("현재 추가 된 회원이 없습니다.");
		} else {
			Person[] peo = pc.getPeople();

			for (Person p : peo) {
				System.out.println(p.information());
			}
			/*
			 * 방법 2
			 * 
			 * for(int i = 0; i>peo.length; i++) { System.out.println(peo[i].information());
			 * }
			 * 
			 */
		}
	}

	private void inserPerson() {
		System.out.println("=== 사원 정보 입력 ===");

		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("나이 : ");
		int age = sc.nextInt();

		System.out.println("재산 : ");
		int wealth = sc.nextInt();
		sc.nextLine();

		boolean a = pc.insertPerson(name, age, wealth);
		if (a == false) {// 또는 if(!a)
			System.out.println("더 이상 추가할 수 없습니다.");

		}

	}
}
