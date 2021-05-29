package com.kh.run;

import java.util.Scanner;

import com.kh.model.dao.FileDao;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileDao fd = new FileDao();
		
		while(true) {
			
			System.out.println("****** MyNote ******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.println("번호를 입력하세요 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				fd.fileSave();
				break;
			case 2:
				fd.fileOpen();
				break;
			case 3:
				fd.fileEdit();
				break;
			case 4:
				default :
					System.out.println("잘못 누르셨습니다. 다시 입력해주세요");
					break;
			}
			
		}
		// 반복문을 통한 메뉴 실행
		// "****** MyNote ******"
		// "" // fd.fileSave() 실행
		// "" // fd.fileOpen() 실행
		// "3. 노트 열어서 수정하기" // fd.fileEdit() 실행
		// "4. 끝내기"
		// "번호를 입력하세요 : "

	}

}
