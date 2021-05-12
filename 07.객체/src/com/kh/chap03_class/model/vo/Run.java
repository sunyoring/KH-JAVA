package com.kh.chap03_class.model.vo;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Person p = new Person();
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("이효리");
		p.setAge(29);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		p.setEmail("lee@iei.or.kr");
		
		System.out.println(p.information());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 이름 : ");
		
		String name = sc.nextLine();
		p.setName(name);
		
		System.out.println(p.information());
		
		DftProduct d = new DftProduct(); //같은 패키지라서 가능


	}

}
