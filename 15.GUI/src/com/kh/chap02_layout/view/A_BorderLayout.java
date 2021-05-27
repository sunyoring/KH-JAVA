package com.kh.chap02_layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame {

	
	
	public A_BorderLayout() {
	
	//1. 컨테이너 셋팅
		super("BorderLayout");
		
		this.setBounds(300, 200, 700, 400);
		
	//2. 레이아웃 설정
		
//		this.setLayout(new BorderLayout()); //정의하지 않으면 default값인 BorderLayout으로 적용된다.
		
	//3. 컴포넌트 객체생성 (버튼)
	
		JButton jb1 = new JButton("남");
		JButton jb2 = new JButton("동");
		JButton jb3 = new JButton("서");
		JButton jb4 = new JButton("가운데");
		
	//4. 레이아웃의 위치별로 컴포넌트 배치(대소문자 주의)
		this.add(new JButton("북"),BorderLayout.NORTH);
		this.add(jb1,"South");
		this.add(jb2,"East");
		this.add(jb3,"West");
		this.add(jb4,"Center");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
