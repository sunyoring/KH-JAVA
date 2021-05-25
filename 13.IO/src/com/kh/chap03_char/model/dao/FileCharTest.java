package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//프로그램 --> 파일 (출려 : 프로그램에서 파일 내보내기)
public class FileCharTest {

	public void fileSave() {
		// FileWriter : 파일로 데이터를 2bye단우로 출력하기 (한글이 깨지지 않는다.)

		// 1. FileWriter 객체생성 --> 해당파일이 없으면 자동으로 만들어지고 연결통로를 만들어준다.
		// 해당파일이 기존에 없으면 연결 통로만 연결

		FileWriter fw = null;

		try {
			fw = new FileWriter("b_char.txt",true); //*중요 : true의 사용 

			// 2. write메소드를 사용해서 출력하고자 하는 데이터를 내보냄, 2byte 단위이므로 문자열 전송가능 (즉, 문자로 하나씩 전송되는
			// 개념)

			fw.write("와 재미있다");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');

			char[] cArr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(cArr);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 이용이 끝나면 반드시 닫아준다.
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// 파일 --> 프로그램 (입력 : 파일로부터 데이터 받아오기)
	public void fileOpen() {

		// FileReader : 파일로부터 데이털르 2byte 단위로 입력받기
		// 1. FileReader 객체생성 --> 연결통로 만들어짐

		FileReader fr = null;

		try {
			fr = new FileReader("b_char.txt");

			int value = 0;

			while ((value = fr.read()) != -1) {
				System.out.print((char) value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // *중요
			try {
				//3. 스트림 사용이 끝나면 반드시 닫아준다.
				if(fr != null)
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
