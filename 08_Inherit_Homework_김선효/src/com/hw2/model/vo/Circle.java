package com.hw2.model.vo;

public class Circle extends Point {
	
	private int radius;
	
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}


	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("면적 : " + Math.round((Math.PI * radius * radius)*10)/10.0);
		System.out.println("둘레 : " + Math.round((Math.PI * radius * 2)*10)/10.0);
	}
	
	
}
