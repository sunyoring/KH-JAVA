package com.kh.chap02_listSort.comparator;

import java.util.Comparator;

import com.kh.chap02_listSort.model.vo.Travel;

public class DscTravelNum implements Comparator<Travel> {

	@Override
	public int compare(Travel o1, Travel o2) {
		// TODO Auto-generated method stub
		return -(o1.gettNum() - o2.gettNum());
	}



}
