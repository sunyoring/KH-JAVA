package com.kh.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.collection.silsub1.model.comparator.AscBoardDate;
import com.kh.collection.silsub1.model.comparator.AscBoardNo;
import com.kh.collection.silsub1.model.comparator.AscBoardTitle;
import com.kh.collection.silsub1.model.comparator.DescBoardDate;
import com.kh.collection.silsub1.model.comparator.DescBoardNo;
import com.kh.collection.silsub1.model.comparator.DescBoardTitle;
import com.kh.collection.silsub1.model.dao.BoardDao;
import com.kh.collection.silsub1.model.vo.Board;

public class BoardManager {

	Scanner sc = new Scanner(System.in);
	BoardDao bd = new BoardDao();
	Date date = new Date();

	public void writeBoard() {
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.println("글 제목 : (공백 포함)");
		String title = sc.nextLine();
		System.out.println("작성자 (공백 미포함)");
		String writer = sc.nextLine();

		System.out.println("글 내용 : (exit입력 시 종료)");
		String content = "";

		while (true) {
			String str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}else {
				content += str + "\n";

			}

			try {
				bd.writeBoard(new Board(bd.getLastBoardNo() + 1, title, writer, date, content));
			} catch (IndexOutOfBoundsException e) {
				bd.writeBoard(new Board(1, title, writer, date, content));
			}
		}
		

		// "새 게시글 쓰기 입니다." 출력
		// "글 제목 : " >> 입력 받음 (공백 포함)
		// "작성자 : " >> 입력 받음 (공백 없이)
		// 작성날짜는 현재 날짜로 처리함
		// "글 내용 : " >> 여러 줄로 입력 받음 >>"exit" 입력하면 입력종료
		// BoardDao의 getLastBoardNo() 메소드를 통해 게시글의 마지막 번호를 알아옴
		// Board 객체 생성시 초기값으로 사용함
		// BoardDao의 writeBoard() 메소드 호출 시 해당 Board 전달
		// 파일이 존재하지 않을 경우, 즉 첫 글 등록일 경우 예외 발생
//		 어떤 예외처리가 발생하는지 알아보고 try catch문을 이용하여 오류 해결

	}

	public void saveListFile() {
		bd.saveListFile();
	}

	public void searchBoard() {
		System.out.println("검색할 제목 : ");
		String title = sc.nextLine();
		bd.searchBoard(title);
		// “검색할 제목 : “ >> 입력 받음
		// BoardDao의 searchBoaard() 메소드에 입력 값 전달
		// 제목은 중복될 수 있기 때문에 결과값 다중  list로 결과값 전달받음
		// 결과값이 없으면 “검색 결과가 없습니다.” 출력
		// 결과값이 있으면 list출력

	}

	public void deleteBoard() {
		System.out.println("삭제할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();

		Board board = bd.displayBoard(no);
		if (board == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			System.out.println(board);
			System.out.println("정말로 삭제하시겠습니까 ? (y/n)");
			char ch = sc.nextLine().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				bd.deleteBoard(no);
				System.out.println("글이 삭제되었습니다.");

			}
		}
		// “삭제할 글 번호 : “ >> 입력 받음
		// BoardDao의 displayBoard() 메소드를 호출하여 해당 글 번호의 게시글 전달 받아 출력
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
		// 있을 경우 “정말로 삭제하시겠습니까? (y/n) : “ >> 입력 받음
		// 대소문자 관계없이 Y 일 경우 BoardDao의 deleteBoard() 메소드에 해당 글 번호 전달

	}

	public void modifyContent() {
		System.out.println("수정할 글 번호 : ");
		int textNum = sc.nextInt();
		bd.displayBoard(textNum);
		if (bd.displayBoard(textNum) == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			System.out.println(bd.displayBoard(textNum));
			System.out.println("변경할 글 내용 : ");
			sc.nextLine();
			String Content = sc.nextLine();
			bd.modifyContent(textNum, Content);
		}
		// “수정할 글 번호 : “ >> 입력 받음
		// BoardDao의 displayBoard() 메소드에 글 번호를 전달하여
		// => 해당 글 번호의 게시글 전달 받아 출력하고
		// “변경할 글 제목 : “ >> 입력 받음
		// BoardDao의 modifyTitle() 메소드에 해당 글 번호와 변경할 제목 전달
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력

	}

	public void modifyTitle() {

		System.out.println("수정할 글 번호 : ");
		int textNum = sc.nextInt();
		bd.displayBoard(textNum);
		if (bd.displayBoard(textNum) == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			System.out.println(bd.displayBoard(textNum));
			System.out.println("변경할 글 제목 : ");
			sc.nextLine();
			String title = sc.nextLine();
			bd.modifyTitle(textNum, title);
		}
		// “수정할 글 번호 : “ >> 입력 받음
		// BoardDao의 displayBoard() 메소드에 글 번호를 전달하여
		// => 해당 글 번호의 게시글 전달 받아 출력하고
		// “변경할 글 제목 : “ >> 입력 받음
		// BoardDao의 modifyTitle() 메소드에 해당 글 번호와 변경할 제목 전달
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력

	}

	public void displayBoard() {
		System.out.println("조회할 글 번호 : ");
		int textNum = sc.nextInt();
		if (bd.displayBoard(textNum) == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			System.out.println(bd.displayBoard(textNum));
		}

		// BoardDao의 displayBoard() 메소드에 글 번호를 전달하여
		// => 해당 글 번호의 게시글 전달 받아 출력하고
		// 조회수를 올리기 위해 BoardDao의 upReadCount() 메소드에 해당 글 번호 전달
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
	}

	public void displayAllList() {
		Iterator it = bd.displayAllList().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// BoardDao의 displayAllList() 메소드를 호출하여 ArrayList를 전달받음
		// Iterator를 이용하여 list 에 기록된 정보를 모두 화면에 출력시킴
	}

	public void sortList(int item, boolean isDesc) {
		ArrayList<Board> list = bd.displayAllList();
		if (item == 1) {
			if (isDesc) {
				list.sort(new DescBoardNo());
			} else {
				list.sort(new AscBoardNo());

			}
		} else if (item == 2) {
			if (isDesc) {
				list.sort(new DescBoardDate());
			} else {
				list.sort(new AscBoardDate());
			}
		} else if (item == 3) {
			if (isDesc) {
				list.sort(new DescBoardTitle());
			} else {
				list.sort(new AscBoardTitle());
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
	// BoardDao의 displayAllList()의 메소드를 호출하여 전체 글 리스트 전달 받아
	// item 이 1이면 번호순 정렬
	// item 이 2이면 날짜순 정렬
	// item 이 3이면 제목순 정렬 작동되게 정렬용 클래스 사용함
	// isDesc 가 true 이면 내림차순정렬 작동
	// isDesc 가 false 이면 오름차순정렬 작동되게 함
}
