package com.kh.chap01_container.view;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MakeJFrame2 {

	public MakeJFrame2() {
		JFrame mainFrame = new JFrame("MyFrame2");
	
//		mainFrame.setBounds(300,300,400,400);
		
		Rectangle r = new Rectangle(300,300,400,400);
		mainFrame.setBounds(r);
		
		try {
			mainFrame.setIconImage(ImageIO.read(new File("images/icecream.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 버튼 눌러도 프로세스는 계속 실행중이므로 프레임을 닫을 때 프로그램도 종료되게 한다.

	}

}
