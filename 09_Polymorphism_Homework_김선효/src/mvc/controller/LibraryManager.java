package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {

	private Member mem = null; // null로 명시초기화
	private Book[] bList = new Book[5]; // 크기 5 할당
	public int count = 5;
	public int searchCount = 0;

	{ // 초기화 블록을 이용하여 샘플 데이터 초기화
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public int getCount() {
		return count;
	}
	public int getSearchCount() {
		return searchCount;
	}

	public void insertMember(Member mem) {
		count++;
		this.mem = mem;
	}

	public Member myInfo() {
		return mem;

	}

	public Book[] selectAll() {
		return bList;

	}

	public Book[] searchBook(String keyword) {
		Book[] search = new Book[5];
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].toString().contains(keyword)) {
				search[searchCount++] = bList[i];
			}
		}
		
		
		return search;
	}

	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index] instanceof AniBook) {
			if(((AniBook)bList[index]).getAccessAge() < myInfo().getAge()){
				result = 1;
			}
		} else if(bList[index] instanceof CookBook) {
				if(((CookBook)bList[index]).isCoupon() == true){
					myInfo().setCouponCount(myInfo().getCouponCount()+1);
					result = 2;
				}
			}
		
		return result;

		// 전달 받은 index의 bList 객체가 실제 AniBook 객체를 참조하고 있고
		// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
		// result를 1로 초기화  나이 제한으로 대여 불가하다는 의미
		// 전달 받은 index의 bList 객체가 실제 CookBook 객체를 참조하고 있고
		// 해당 요리책의 쿠폰유무가 “true”일 경우
		// 회원의 couponCount 1 증가 처리 후
		// result를 2로 초기화  성공적으로 대여 완료, 요리학원 쿠폰이 발급됐다는 의미
		// result 값 리턴

	}
}
