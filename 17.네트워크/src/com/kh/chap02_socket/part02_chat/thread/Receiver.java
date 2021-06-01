package com.kh.chap02_socket.part02_chat.thread;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receiver implements Runnable {
	
	private DataInputStream in; //전달 된 데이터를 입력받을 스트림
	
	// Receiver 객체 생성 시 매개변수로 소켓을 전달받아온다.
	// 전달받은 소켓을 이용하여 입력 스트림과 연결한다.
	
	
	public Receiver() {
		// TODO Auto-generated constructor stub
	}

	public Receiver(Socket socket) {
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//스레드 처리 작업
	//Sender 에서 출력된 내용을 현재 화면에 입력하는 작업 처리
	//한 번만 출력할 것이 아니므로 무한루프로 만든다.
	@Override
	public void run() {

		while(true) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
		
	}

}
