package com.kh.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	Scanner sc = new Scanner(System.in);

	public FileDao() {
		// TODO Auto-generated constructor stub
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		while (true) {
			while(true) {
				System.out.println("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) :");
				String input = sc.nextLine();
				if (input.equals("exit")) {
					break;
				} else {
					sb.append(input);
				}
			}
		

			BufferedWriter bw = null;
			System.out.println("저장하시겠습니까? (y/n)");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'y' || ch == 'Y') {
				System.out.println("저장할 파일명을 입력하시오.");
				String fileName = sc.nextLine();
				
				try {
					bw = new BufferedWriter(new FileWriter(fileName + ".txt", true));
					bw.write(sb +" ");
					
					System.out.println("저장 완료");
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try{
						if(bw!=null) 	
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				}else {
					System.out.println("다시 메뉴로 돌아갑니다.");
					break;
				}
				
			}

		
		}

	public void fileOpen() {

		System.out.println("열기 할 파일명 : ");
		String fileName = sc.nextLine();
		BufferedReader br = null;
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		try {
			br = new BufferedReader(new FileReader(fileName+".txt"));
			String temp = null;

			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
		}catch( FileNotFoundException e ) {
			System.out.println("존재하는 파일이 없습니다.");
		}catch( IOException e ) {
		e.printStackTrace();
		}finally {
		if(br != null)
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}


	public void fileEdit() {
		System.out.println("수정 할 파일명 : ");
		String fileName = sc.nextLine();
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuilder sb = new StringBuilder();

		// 파일명을 입력받아 BufferedReader와 BufferedWriter, FileReader와 FileWriter
		// 스트림 사용
		try {
			br = new BufferedReader(new FileReader(fileName+".txt"));
			String temp = null;

			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}

			bw = new BufferedWriter(new FileWriter(fileName + ".txt", true));
			while(true) {
				System.out.println("파일에 추가할 내용을 입력하십시오 : ");
				String input = sc.nextLine();
				if (input.equals("exit")) {
					break;
				} else {
					sb.append(input);
				}	
			}
				System.out.println("변경 된 내용을 파일에 추가하시겠습니까 ? (y/n)");
				char ch = sc.nextLine().charAt(0);
				if(ch == 'y' || ch == 'Y') 
					bw.write(sb+"");
				System.out.println("입력받은 " +fileName+".txt 파일의 내용이 변경되었습니다.");

			
			
		// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
		}catch( FileNotFoundException e ) {
			System.out.println("존재하는 파일이 없습니다.");
		}catch( IOException e ) {
		e.printStackTrace();
		}
			// 반복문을 통해 해당 파일의 내용을 readLine()메소드를 통해 콘솔에 출력
			// “파일에 추가할 내용을 입력하시오 : “
			// 사용자가 “exit”을 입력하기 전까지 내용을 StringBuilder에 담기
			// “변경된 내용을 파일에 추가하시겠습니까? (y/n)”
			// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
			// “입력받은 파일명.txt 파일의의 내용이 변경되었습니다.”

		finally {
			if(bw != null && br != null) {
				try {
					bw.close();
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}
	}


	
