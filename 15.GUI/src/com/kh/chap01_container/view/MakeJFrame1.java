package com.kh.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MakeJFrame1 extends JFrame{

	public MakeJFrame1() {

		super("MyFrame");// title
		
		this.setBounds(300,200,600,500);//컨테이너 위치 (좌표 x,좌표y, 가로w,세로h)
		
		
		
	
		//title 위치, 크기 수정
		this.setTitle("abc");	
		this.setLocation(200,300);
		this.setSize(800,500);
		
		try {
			this.setIconImage(ImageIO.read(new File("images/cat.PNG")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//필수
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 버튼 눌러도 프로세스는 계속 실행중이므로 프레임을 닫을 때 프로그램도 종료되게 한다.
		
		
	}
	
	
}
