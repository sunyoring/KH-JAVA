package com.kh.chap02_abstractAndInterface.model.vo;

public abstract class Sports {

	private int people;
	
	public Sports() {
		// TODO Auto-generated constructor stub
	}

	public Sports(int people) {
		super();
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people = " + people + "]";
	}
	

	public abstract void rule();
	//추상메소드 (미완성된 메소드로 내용이 구현되지 않은 메소드)
	//---> {} 몸통부가 구현되지 않은 상태
	
	//---> 미완성 된 추상 메소드가 있다는 것은 클래스 또한 미완성 클래스임을 의미 --->추상 클래스로 명시해주어야 함.   public abstract class Sports{}
}
