package com.kh.chap03_guiMessenger.model;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import com.kh.chap03_guiMessenger.view.MyFrame;

public class Messenger {

	private MyFrame f;
	private DatagramSocket socket;
	private InetAddress address = null;
	private final int MP; // 내 포트
	private final int OTHMP; // 상대방 포트

	public Messenger(int myPort, int otherPort) {
		this.MP = myPort;
		this.OTHMP = otherPort;

		try {
			address = InetAddress.getByName("127.0.0.1");// 나 자신을 가리키는 포트번호

			socket = new DatagramSocket(myPort);
			f= new MyFrame(address,otherPort,socket);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public MyFrame getMyFrame() {
		
		return f;
	}

}
