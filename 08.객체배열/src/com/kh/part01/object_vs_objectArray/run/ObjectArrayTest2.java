package com.kh.part01.object_vs_objectArray.run;

public class ObjectArrayTest2 {

	public static void main(String[] args) {
		//제품을 담을 Product 객체 배열 할당 - 3개 제품을 받도록
		
		Product[] pArr = new Product[3];
		
		pArr[0] = new Product("갤럭시","삼성",100);
		pArr[1] = new Product("아이폰","애플",200);
		pArr[2] = new Product("블랙베리","엘지",300);
	
	
		for(Product p : pArr) {
			System.out.println(p.information());
		}
	
	}
	


}
