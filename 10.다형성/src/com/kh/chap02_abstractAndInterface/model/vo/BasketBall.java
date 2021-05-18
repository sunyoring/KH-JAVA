package com.kh.chap02_abstractAndInterface.model.vo;

public class BasketBall extends Sports {

	
	//상속받는 부모 클래스에 있는 추상 메소드를 강제 오버라이딩, 또는 추상 클래스로 명시해주어야 함  --->미완성 상태이기 때문
	@Override
	public void rule() {
		System.out.println("공을 던져서 링에 넣어야 한다.");
	}

}
