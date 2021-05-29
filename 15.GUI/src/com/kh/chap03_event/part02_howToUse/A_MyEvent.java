package com.kh.chap03_event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class A_MyEvent implements ActionListener{

	private JLabel label;

	public A_MyEvent() {
		// TODO Auto-generated constructor stub
	}

	public A_MyEvent(JLabel label) {
		super();
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.label.setText("드디어 버튼이 눌렸습니다.");
	}

}
