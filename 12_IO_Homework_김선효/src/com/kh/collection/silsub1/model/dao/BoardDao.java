package com.kh.collection.silsub1.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.collection.silsub1.model.vo.Board;

public class BoardDao {

	ArrayList<Board> list = new ArrayList<>();

	public Board displayBoard(int no) {
		Board board = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == no) {
				board = list.get(i);
				break;
			}
		}

		upReadCount(no);
		return board;
	}

	public void upReadCount(int no) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setReadCount(list.get(i).getReadCount() + 1);
		}
	}

	public void modifyTitle(int no, String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == no) {
				list.get(i).setBoardTitle(title);

			}
		}
	}

	public void modifyContent(int no, String content) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == no) {
				list.get(i).setBoardContent(content);

			}
		}
	}

	public void deleteBoard(int no) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == no) {
				list.remove(i);
				break;
			}
		}

	}

	public ArrayList<Board> searchBoard(String title) {

		ArrayList<Board> searchList = new ArrayList<Board>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardTitle().equals(title)) {
				searchList.add(list.get(i));
				list.get(i).setReadCount(list.get(i).getReadCount() + 1);
			}
		}
		return searchList;

	}

	public void saveListFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
			System.out.println(list);
			oos.writeObject(list);

			System.out.println("board_list.dat에 성공적으로 저장되었습니다.");

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList displayAllList() {

		return list;
	}

	public int getLastBoardNo() {
	
		return (list.get(list.size()-1).getBoardNo());
	}

	public void writeBoard(Board board) {
		list.add(board);
	}

}
