package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		// file : 파일을 제어하기 위한 클래스로 입출력 기능을 제공하지 않는다. - 파일의 입출력은 스트림을 사용해야 한다.
		
		
		try {
			
			//1. 경로지정을 따로 해주지 않으면 현재 project폴더에 생성된다.
			File f1 = new File("test.txt");	//메모리상에 객체로 존재하는 상태	
//			f1.createNewFile(); //파일 생성
			
			//2. 기존의 드라이브나 폴더에 파일 생성
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			
//			File f3 = new File("C:\\test\\test.txt"); 폴더생성이 바로 되지 않음 : IOException발생
//			f3.createNewFile();
			
			File testFolder = new File("C:\\test");
			testFolder.mkdir();//폴더생성
			
			File f3 = new File("C:\\test\\test.txt"); 
			f3.createNewFile();
			
			
			System.out.println(f3.exists()); //존재여부 확인
			System.out.println(f1.exists()); //존재여부 확인
			System.out.println(testFolder.exists()); //존재여부 확인
			
			System.out.println(f3.isFile()); //파일인지 아닌지 확인
			System.out.println(testFolder.isFile());
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명  : " + file.getName());
			System.out.println("절대경로  : " + file.getAbsolutePath());//최상위 경로부터 내 파일이 있는 경로까지 모두 나타냄.
			System.out.println("현재경로  : " + file.getPath()); //파일이 위치한 폴더를 기준으로 상대적인 경로 
			System.out.println("파일용량  : " + file.length());
			System.out.println("상위폴더  : " + file.getParent());
			
		} catch (IOException e) {

			e.printStackTrace();
		} 

	}

}
