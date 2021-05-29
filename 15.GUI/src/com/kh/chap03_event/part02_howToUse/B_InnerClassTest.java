package com.kh.chap03_event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_InnerClassTest extends JFrame {
	// 2.내부(Inner)클래스(리스터 인터페이스를 구현한)를 위한 이벤트 처리
	JButton button;
	JLabel label;

	public B_InnerClassTest() {
		this.setSize(300, 200);

		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌리지 않았습니다.");

		button.addActionListener(new MyEvent());

		panel.add(button);
		panel.add(label);

		this.add(panel);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new B_InnerClassTest();

	}
	
	class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("드디어 버튼이 눌렸습니다.");
			
		}
		
	}

}
