package com.kh.chap02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E_NullLayout extends JFrame{
	
	public E_NullLayout() {
		
		super("NullLayout");
		
		this.setBounds(300,210,510,510);
		setLayout(null);
		
		JLabel lb = new JLabel("이름 : ");
		lb.setLocation(50,100);
		lb.setSize(200, 50);
		
		JTextField tf = new JTextField();
		tf.setLocation(110, 100);
		tf.setSize(200,50);
		
		JButton bt = new JButton("추가");
		bt.setLocation(350, 100);
		bt.setSize(100, 50);
		
		//컨테이너에 컴포넌트 붙이기
		
		add(lb);
		add(tf);
		add(bt);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
