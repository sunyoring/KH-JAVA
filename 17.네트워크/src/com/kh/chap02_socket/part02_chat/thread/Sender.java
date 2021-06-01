package com.kh.chap02_socket.part02_chat.thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Sender implements Runnable {
	
	
	private String name;  //데이터를 보내는 사용자 명
	private DataOutputStream out; // 데이터 출력용 스트림
	
	private Scanner sc; //입력 스캐너
	
	public Sender() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Sender 객체 생성 시 매개변수로 socket와 name을 받아온다.
	//server에서 생성 : 요청을 수락한 Client소켓, 서버명을 받아옴
	//client에서 생성 :  연결 된 sever의 소켓, 클라이언트 명을 받아옴. 
	public Sender(Socket socket, String name) {
		this.name = name;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	스레드 처리작업
	// 채팅을 한번에 입력할 것이 아니기때문에 무한루프를 이용하여 Scanner로 데이터를 입력받고 입력은 내용을 연결된 출력 스트림을 통해서 출력한다.

	@Override
	public void run() {
		sc = new Scanner(System.in);

		while(true) {
			try {
				out.writeUTF(name + " > " + sc.nextLine());
			} catch (IOException e) {
				e.printStackTrace();
				
				break; //서버나 클라이언트 중 한쪽이 먼저 종료되면 에러발생, 루프 종료시킴
			}
		}
		
	}

}
