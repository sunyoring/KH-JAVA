package com.kh.chap04_assist.part01_object.run;

import com.kh.chap04_assist.part01_object.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {
		ObjectsDao ob = new ObjectsDao();
		ob.fileSave();
		ob.fileOpen();

		//EOFException : 파일의 끝을 만났다 end of file
	}

}
