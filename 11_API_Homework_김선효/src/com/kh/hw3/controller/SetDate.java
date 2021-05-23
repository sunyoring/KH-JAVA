package com.kh.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SetDate {


	public SetDate() {

	}

	public String todayPrint() {
		GregorianCalendar gc = new GregorianCalendar(); // 현재시간


		int year = gc.get(GregorianCalendar.YEAR);
		int m = gc.get(GregorianCalendar.MONTH) + 1;
		int d = gc.get(GregorianCalendar.DATE);
		int h = gc.get(GregorianCalendar.HOUR);
		int mi = gc.get(GregorianCalendar.MINUTE);
		int s = gc.get(GregorianCalendar.SECOND);

		String today = year + "년 " + m + "월 " + d + "일 " + h + "시 " + mi + "분 " + s + "초";
		return today;
	}

	public String setDay() {
		Calendar calendar = Calendar.getInstance(); // 현재 시각

		
		calendar.set(2011,2,21);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");

		return sdf1.format(calendar.getTime());
	}
}
