package com.kh.race.model.thread;

import com.kh.race.run.Run;

public class Heart implements Runnable {

	@Override
	public void run() {

		int ran = 0;
		try {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 30; j++) { // 콘솔창 클리어용 개행(30줄)
					System.out.println();
				}

				// 처음 출력 시
				if (i == 0) {
					System.out.println(" 준비");
					System.out.println("♡");
					System.out.println("★");
				} else {
					ran = (int)(Math.random() * 5) + 1;
					Run.tot1 += ran;// 값 누적시키기

					// 생성되어 누적된 수만큼 - 로 표시
					// 하트출력
					for (int k = 0; k < Run.tot1; k++) {
						System.out.print("-");
					}
					System.out.println("♡");
					// 별 출력
					for (int k = 0; k < Run.tot2; k++) {
						System.out.print("-");
					}

					System.out.println("☆");
				}

				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 한 번 출력하고 1초 일시정지
	}
}
