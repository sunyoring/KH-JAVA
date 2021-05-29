package com.kh.chap03_event.part01_mouseAndKeyEvent.run;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class B_KeyEvent extends JFrame implements KeyListener{
	//3. 프레임 상속받고 인터페이스 임플리먼츠 하여 구현
	
	
	public B_KeyEvent() {
		super("Key Event");
		setSize(300,200);
		setLayout(null);
		
		JTextField tf = new JTextField();
		tf.setSize(100,50);
		
		tf.addKeyListener(this);
		
		
		this.add(tf);
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new B_KeyEvent();
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("유니코드 키인 경우 누른 키를 떼는 순간 발생하는 이벤트");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키보드가 눌렸을 때");
		System.out.println(e.isShiftDown());
		System.out.println(e.isControlDown());
		
		if(e.getKeyChar() == 'q') {
			System.out.println("시스템종료");
			System.exit(0);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("키보드가 떼어질 때");
	}

}
