package com.kh.chap03_event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_AnonymousClassTest {


	//3.익명클래스 - 인터페이스 에서의 abstract 메소드를 바로 구현해서 인터페이스로 객체화 시킬 수 있다.
	
	public C_AnonymousClassTest() {
		JFrame mf = new JFrame("익명클래스");

		
		mf.setSize(300, 200);

		JPanel panel = new JPanel();
		JButton button = new JButton();
		JLabel label =  new JLabel("아직 버튼이 눌리지 않았습니다.");
		button = new JButton("버튼을 눌러보세요");
		button.addActionListener(new ActionListener() {
			//리스터를 구현한 클래스를 이용하는 것이 아니라 리스터 인터페이스 자체를 객체화 하여 사용
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("드디어 버튼이 눌려졌습니다."); 
				
			}
			
			
			
		});

		panel.add(button);
		panel.add(label);

		mf.add(panel);

		mf.setVisible(true);
		mf.setDefaultCloseOperation(mf.EXIT_ON_CLOSE);	
		}
	public static void main(String[] args) {
		new C_AnonymousClassTest();
	}
}
