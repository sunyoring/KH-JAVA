package com.kh.part01_thread.run;

import com.kh.part01_thread.model.thread.Thread1;
import com.kh.part01_thread.model.thread.Thread2;

public class Run {

	// Runnable 인터페이스 vs Thread 클래스의 차이점
		// - Runnable 인터페이스는 스레드화 될 수 있는 메소드 run() 메소드를 가지고있다. 
		// - Thread 클래스는 Runnable 인터페이스를 구현하고 있으며 스레드를 활성화 하는 start() 메소드를 가지고있다.
		// - Thread 클래스는 Thread 상태를 제어 할 수 있는 메소드를 가지고 있다.
	
	public static void main(String[] args) {
		
		//스레드를 만드는 조건
		//main 메소드에서
		//1. Thread 객체 필요
		//2. run() 필요
		//3. start() 필요

		Thread1 th1 = new Thread1();
		
		// Runnable인터페이는 run메소드만을 가지고 있으므로 start해주기 위해  Thread에 매개로 객체를 새로 생성해줘야한다.
		Thread2 th2 = new Thread2(); 
		Thread th = new Thread(th2);
		
//		th1.run();
//		th.run(); ---> 스레드 생성만 한 상태
		
		th1.start();
		th.start(); //스레드가 실행된다.
		
		System.out.println(" 메인 메소드 ");
		
//		th1.start();// 에러발생 --> 한번 start()하여 사용한 객체는 다시 사용되지 않으므로 새로 객체를 생성해서 사용
	
	}

}
