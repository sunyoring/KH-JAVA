package com.kh.part03_control.run;

import com.kh.part03_control.model.thread.InterruptSample;
import com.kh.part03_control.model.thread.Thread4;

public class Run {

	public static void main(String[] args) {

//		Thread4 th4 = new Thread4();
//		new Thread(th4).start();
		
		
		InterruptSample is = new InterruptSample();
		is.sleepInterrupt();
	}

}
