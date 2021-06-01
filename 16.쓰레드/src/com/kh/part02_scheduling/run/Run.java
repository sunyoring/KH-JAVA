package com.kh.part02_scheduling.run;

import com.kh.part02_scheduling.model.thread.Thread3;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread3 th3 = new Thread3();
		
		for(int i = 1; i<= 100; i++) {
			Thread thread = new Thread(th3); //우선 순위 기본 5

			if( i % 2 == 0) {
				thread.setPriority(Thread.MAX_PRIORITY); // 10
				thread.setName("thread 짝" + i);
			}else {
				thread.setPriority(Thread.MIN_PRIORITY); //1
				thread.setName("thread 홀" + i);
			}
			
			thread.start();

		}
	}

}
