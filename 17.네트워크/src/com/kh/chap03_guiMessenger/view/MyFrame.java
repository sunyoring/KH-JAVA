package com.kh.chap03_guiMessenger.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	//UDT방식
	private DatagramSocket socket;
	private DatagramPacket packet;
	private JTextField textField;
	private JTextArea textArea;
	private InetAddress address;
	private int otherPort;
	
	public MyFrame(InetAddress address,int otherPort,DatagramSocket socket) {
		this.address = address;
		this.otherPort = otherPort;
		this.socket = socket;
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10,30);
		textArea.setEditable(false); //입력된 채팅을 수정할 수 없도록 막는다.
		
		this.add(textField, BorderLayout.PAGE_END);
		this.add(textArea, BorderLayout.CENTER);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = textField.getText(); //적힌 글을 가져온다.
		byte[] buffer = str.getBytes();//UDT방식은 byte[]로 전달한다. 따라서 담아준다.
		
		DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length,address,otherPort);
		
		try {
			socket.send(sendPacket); // 데이터팩을 소켓에 보내준다.
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		textArea.append("SENT : " + str + "\n"); //보낸 내용을 출력
		textField.selectAll(); //보낸 내용이 바로 선택되도록 해줌.
	}
	
	public void process() {
		while(true) {
			byte[] buf = new byte[256];
			packet = new DatagramPacket(buf, buf.length);
			
			try {
				socket.receive(packet);
				textArea.append("RECEIVE : " + new String(buf) + "\n" );
				//buf를 new String으로 생성하여 스트링으로 변환한다.
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //input같은 기능 receive
		}
	}
	
	
	
}
