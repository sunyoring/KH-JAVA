package com.kh.hw6.controller;

import java.util.Calendar;

public class DateCalculator {

	public DateCalculator() {
		// TODO Auto-generated constructor stub
	}

	public long leapDate() {
		Calendar cal = Calendar.getInstance();

		Long sumDays = 0L;
		for (int i = 1; i < cal.get(Calendar.YEAR); i++) {
			sumDays += isLeapYear(i) ? 366 : 365;

		}
		for (int j = 1; j < cal.get(Calendar.MONTH) + 1; j++) {
			if (j == 4 || j == 6 || j == 9 || j == 11) {
				sumDays += 30;
			} else {
				if (j == 2) {
					if (isLeapYear(cal.get(Calendar.DAY_OF_MONTH))) {
						sumDays += 29;
					} else {
						sumDays += 28;
					}
				}
				sumDays += 31;
			}

		}

		for (int k = 0; k < cal.get(Calendar.DAY_OF_MONTH); k++) {
			sumDays += k;
		}
		return sumDays;
	}

	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
