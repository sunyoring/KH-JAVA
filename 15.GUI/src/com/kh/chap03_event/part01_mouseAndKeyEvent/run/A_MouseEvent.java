package com.kh.chap03_event.part01_mouseAndKeyEvent.run;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_MouseEvent implements MouseListener {
	// 1. 별도의 클래스로 리스터 이벤트 구현

	public A_MouseEvent() {
		// 컨테이너
		JFrame jf = new JFrame();
		jf.setTitle("Mouse Event");
		jf.setSize(300, 200);

		JPanel panel = new JPanel();

		panel.addMouseListener(this);

		jf.add(panel);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new A_MouseEvent();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clecked : " + e.getClickCount() + "X = " + e.getX() + ", Y = " + e.getY()
				+ ", 클릭버튼 = " + e.getButton());

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("누를 때");
		this.display(" 마우스 클릭 수 : " + e.getClickCount(),e);
	}

	private void display(String s, MouseEvent e) {
		System.out.println(s + " X = " + e.getX() + ", Y= " + e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("뗄 때");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered : " + e.getClickCount() + "X = " + e.getX() + ", Y = " + e.getY()
				+ ", 클릭버튼 = " + e.getButton());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("빠져나갈 때");

	}

}
