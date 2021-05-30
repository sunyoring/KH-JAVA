package com.kh.collection.silsub2.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import com.kh.chap04_map.model.vo.Student;
import com.kh.collection.silsub2.model.vo.Book;

public class BookDao {

	private HashMap<String, Book> bookMap = new HashMap<>();

	public BookDao() {
		// TODO Auto-generated constructor stub
	}

	public BookDao(HashMap<String, Book> bookMap) {
		super();
		this.bookMap = bookMap;
	}

	public int getLastBookNo() {
		Set<String> kset = bookMap.keySet(); // bookMap에 있는 키들만 keySet컬렉션에 담았다. (키들의 집합)
		Book book = null;
		int LastNum = 0;
		Iterator<String> iter = kset.iterator(); // keySet에 있는 key값들을 Iterator반복자에 담는과정
		while (iter.hasNext()) {
			String key = iter.next(); // 있으면 키를 담고
			book = bookMap.get(key);
			LastNum = Integer.parseInt(book.getbNo());
			break;
		}
		if (book == null) {
			return 0;
		} else {
			return LastNum;
		}

	}

	public void addBook(Book book) {

	}

	public Book deleteBook(String key) {
		Book book = null;
		book = bookMap.get(key);

		return book;

	}

	public String searchBook(String title) {
		Set<Entry<String, Book>> eSet1 = bookMap.entrySet();
		Iterator<Entry<String, Book>> it1 = eSet1.iterator();

		while (it1.hasNext()) {
			Entry<String, Book> entry = (Entry) it1.next();
			
		}
		return null;

	}

	public Book selectBook(String key) {
		return null;

	}

	public HashMap<String, Book> selectAll() {
		return bookMap;

	}

	public ArrayList<Book> sortedBookList() {
		return null;

	}

}
