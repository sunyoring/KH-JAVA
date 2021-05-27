package com.kh.chap02_layout.view;

import java.awt.GridLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame {
	
	public C_GridLayout() {
		
		super("GridLayout");
		setBounds(300,200,600,400);
		setLayout(new GridLayout(5,5));
		
		
		// 좌에서 우로 증가하는 1~25까지 버튼 만들기
		
		/*
		for(int i = 1; i < 26; i++) {
		 String input = Integer.valueOf(i).toString();
		 add(new JButton(input));
		}
		*/
		
		//빙고판 만들기
		//중복제거, 랜덤으로
		
		Set<Integer> set = new LinkedHashSet<>();
		while(set.size() < 25) {
			int num = (int)(Math.random()*25+1);
			set.add(num);
		}
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			String str =Integer.valueOf(it.next()).toString();
			this.add(new JButton(str));
		}
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
