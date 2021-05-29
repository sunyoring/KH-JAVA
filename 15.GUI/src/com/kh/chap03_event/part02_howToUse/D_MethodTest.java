package com.kh.chap03_event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.chap03_event.part02_howToUse.B_InnerClassTest.MyEvent;

public class D_MethodTest extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	public D_MethodTest() {
		this.setSize(300, 200);

		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌리지 않았습니다.");

		button.addActionListener(this);

		panel.add(button);
		panel.add(label);

		this.add(panel);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	}
	public static void main(String[] args) {
		 new D_MethodTest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("드디어 버튼이 눌려졌습니다. ");
	}
	

}
