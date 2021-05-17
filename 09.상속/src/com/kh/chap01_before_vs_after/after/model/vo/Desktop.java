package com.kh.chap01_before_vs_after.after.model.vo;

public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {
		// TODO Auto-generated constructor stub
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price);//super()생성자는 자식생성자에서 부모생성자를 호출하여 사용 . 반드시 첫 줄 작성
		
//		super.pCode = pCode; 직접 접근일 때는 부모필드 접속제어자를 protected로 변경.(접근하고자 하는 필드가 private일 때는 접근불가)
		//super. 의 super는 해당 객체의 부모주소를 가지고 있다. 따라서 super.으로 접근 가능
		
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", allInOne : " + allInOne;
	}

/*
	public void print() {
		System.out.println("나 deskktpo이야 ");
	}
	*/
	

}
