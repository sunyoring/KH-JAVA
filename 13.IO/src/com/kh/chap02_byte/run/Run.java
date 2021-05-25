package com.kh.chap02_byte.run;

import com.kh.chap02_byte.mocdel.dao.FileByteTest;

public class Run {

	public static void main(String[] args) {
		FileByteTest fb = new FileByteTest();
		fb.fileSave();
		fb.fileRead();
	}

}
