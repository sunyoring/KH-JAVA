package com.kh.chap02_socket.part02_chat.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import com.kh.chap02_socket.part02_chat.thread.Receiver;
import com.kh.chap02_socket.part02_chat.thread.Sender;

public class ChatClientManager {

	public void startClient() {
		
		String name = "Client"; //클라이언트 명
		
		int port = 8500;
		
		String serverIP = null;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println("Client Start");
			
			//클라이언트 소켓용 객체 생성
			
				Socket socket = new Socket(serverIP,port);
				System.out.println("서버와 연결이 되었습니다. ");
			
				//서버만 일방적으로 데이터를 주고 받는 것이 아니기 때문에 클라이언트용 스레드도 만들어준다.
				Sender sender = new Sender(socket , name);
				Thread sth = new Thread(sender);
				
				Receiver receiver = new Receiver(socket);
				Thread rth = new Thread(receiver);
				
				sth.start();
				rth.start();
		
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
