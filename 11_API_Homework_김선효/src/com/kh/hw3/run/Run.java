package com.kh.hw3.run;

import com.kh.hw3.controller.SetDate;

public class Run {

	public static void main(String[] args) {
		SetDate tw1 = new SetDate();

		System.out.println(tw1.todayPrint());
		System.out.println(tw1.setDay());

	}
}