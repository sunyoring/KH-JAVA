package com.kh.hw4.model.vo;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private double taxRate;
	
	 public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, int salary, double taxRate) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.taxRate = taxRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", salary=" + salary + ", taxRate=" + taxRate;
	}
	
	

	
	 
	 
}
