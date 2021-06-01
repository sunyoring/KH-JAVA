package com.kh.race.run;

import com.kh.race.model.thread.Heart;
import com.kh.race.model.thread.Star;

public class Run {
	
	
	// 처음부터 얼만큼 움직였는 지 누적시킬 public static int 변수
	// static이므로 값이 객체에 상관없이 static 영역에 유지되고 공유됨(tot값이 높으면 승)
	public static int tot1 = 0;
	public static int tot2 = 0;
	
	public static void main(String[] args) {
		
		Heart h = new Heart();
		Star s = new Star();
		
		Thread th1 = new Thread(h);
		Thread th2 = new Thread(s);
		
		try {
			th1.start();
			Thread.sleep(500);
		
			th2.start();

			th1.join(); //main스레드가 th1의 작업이 끝날  때까지 대기
			th2.join(); //main스레드가 th2의 작업이 끝날  때까지 대기
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = Run.tot1 > Run.tot2 ? "하트 승!!" : (Run.tot1 < Run.tot2 ? "별 승!!" : "무승부 !!");
		System.out.println(str);
	}

}
