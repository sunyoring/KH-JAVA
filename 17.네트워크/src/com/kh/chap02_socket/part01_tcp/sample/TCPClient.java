package com.kh.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	/*
	 * 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성 서버와 입출력 스트림 오픈 보조 스트림을 통해 성능
	 * 개선 스트림을 통해 읽고 쓰기 통신종료
	 */

	public void ClintStart() {
		// 1.서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성

		int port = 8500;
		String serverIP = null;

		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			// 2. 서버와 입출력 스트림 오픈
			// 서버IP : 172.30.1.28 라는 식으로 정의가 되어있다면
			Socket server = new Socket(serverIP, port); // Socket의 serverIP는 String 타입이므로 "172.30.1.28"이렇게 넣어준다.

			System.out.println("서버와 연결 되었습니다.");
			
			
			//3. 서버와 입출력 스트림 오픈
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			
			PrintWriter pw = new PrintWriter(server.getOutputStream());
			
			//4. 스트림을 통해 읽고 쓰기
			pw.println("반가워요");
			pw.flush();
			
			String message = br.readLine();
			System.out.println("서버가 보낸 메세지  : " + message);
			
			//통신 종료
			pw.close();
			br.close();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
