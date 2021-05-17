package com.kh.chap01_before_vs_after.after.model.vo;

public class Tv extends Product {

	private int inch;
	
	public Tv() {
		// TODO Auto-generated constructor stub
	}

	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", inch : " + inch ;
	}
	
	
}
