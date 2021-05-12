package com.kh.chap05_initBlock.model.vo;

public class Product {
	
	//인스턴스 변수
	//1. 아무 초기화 없이 Product 객체를 생성하여 출력시 JVM이 정한 기본값으로 초기화 
	
//	private String pName;
//	private int price;
//	private static String brand;
	
	//2. 필드에 명시적 초기화 한후 객체 생성하여 출력
	private String pName="갤럭시";
	private int price=90000;
	private static String brand ="삼성";
	
	//3.static블록 - 클래스 변수를 초기화 시키는 블럭으로 프로그램 시작 시 단 한번만 초기화,클래스 초기화
	static {
		brand = "엘지";
		
	}
	
	//4. 인스턴스 블록 - 인스턴스 변수를 초기화 시키는 블럭으로 객체생성시 마다 초기화 된다. 생성자보다 먼저 실행됨.
	{
		pName = "갤럭시1";
		price = 1000000;
		
	 //	brand = "애플"; -->인스턴스 블럭에서는 static 필드도 초기화가 가능하지만 static초기화 블럭은 프로그램 시작 시에
						//초기화된 것이므로 객체 생성이후 값을 초기화 하는 인스턴스 초기화 블럭의 값으로 덮어 쓰게 된다.
		
	}
	
	public Product() {

	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static String getBrand() {
		return brand;
	}
	public static void setBrand(String brand) {
		Product.brand = brand;
	}
	
	public String information() {
		return pName + " " + price + " " + brand;
	}
	
	
}
