package com.hw1.model.vo;

public class RollerCoaster {

	public static double CUTHEIGHT = 110.0;// 제한 키
	public static int PRICE = 4500;// 가격
	public static int PERMITNUMBER = 2; // 수용인원

	public RollerCoaster() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CUTHIGHT= " + CUTHEIGHT + ", PRICE= " + PRICE + ", PERMITNUMBER= " + PERMITNUMBER;
	}
	
}
