package com.kh.chap03_event.part03_changePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	JPanel panel;
	
	public MainFrame() {
	
		setSize(300,200);
		setTitle("패널바꾸기");
		
		//파란색 패널 객체 만들기
		panel = new Panel1();
		
		
		//패널 이벤트 구현(익명 클래스)
		
		panel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				replace();
			}
			
		});
		
		
		
		
		
	
		add(panel);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	protected void replace() {
		remove(panel);
		panel = callPanel2();
		add(panel); //분홍색 패널을 프레임에 부착함.
		repaint(); //반드시 실행해야 패널이 바뀐다.
	}



	private JPanel callPanel2() {

		return  new Panel2();
	}



	public static void main(String[] args) {
		new MainFrame();
	}

}
