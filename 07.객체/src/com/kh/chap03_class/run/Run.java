package com.kh.chap03_class.run;

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
		
		Product p1 = new Product();
		
		p1.setpName("갤럭시");
		p1.setPrice(10000);
		p1.setBrand("삼성");
		
		Product p2 = new Product();
		
		p2.setpName("아이폰");
		p2.setPrice(12000);
		p2.setBrand("애플");
		
		System.out.println(p1.information());

		System.out.println(p2.information());
		
//		DftProduct d = new DftProduct(); -->외부 패키지이기 때문에 사용 불가
		


	}

}
