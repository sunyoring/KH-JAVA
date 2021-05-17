package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;// 최대 회원 수 상수필드로 10 초기화
	private int memberCount;// 현재 회원 수 필드
	private Member[] mem = new Member[SIZE];// 회원들의 정보를 담는 객체 배열

	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public Member[] getMem() {
		return mem;
		// mem 주소 값 리턴
	}

	public Member checkId(String userId) {
		Member m = null; // 아이디로 검색된 결과를 담을 변수 초기화
		// mem 에서 매개변수로 전달받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입
		// m 리턴
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				m = mem[i];
			}
		}
		return m;
	}

	public void insertMember(Member m) {

		mem[memberCount++] = m;
		// 매개변수로 전달받은 회원객체를 mem 배열에 추가
		// memberCount 1 증가
	}

	public Member searchMember(int menu, String search) {
		Member searchMember = null;
		if (menu == 1) {
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getUserId().equals(search)) {
					searchMember = mem[i];
				}
			}
		} else if (menu == 2) {
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getName().equals(search)) {
					searchMember = mem[i];
				}
			}
		} else {
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getEmail().equals(search)) {
					searchMember = mem[i];
				}
			}
		}

		return searchMember;

	}

	public void updateMember(Member m, int menu, String update) {
		if (menu == 1) {
			m.setUserPwd(update);
		} else if (menu == 2) {
			m.setName(update);

		} else {
			m.setEmail(update);

		}
		// 매개변수로 전달받은 m 회원과 변경 내용인 update 문자열을 menu에 따라
		// 1 인 경우 setter 메소드를 이용하여 m의 비밀번호를 update 문자열로 변경
		// 2 인 경우 setter 메소드를 이용하여 m의 이름을 update 문자열로 변경
		// 3 인 경우 setter 메소드를 이용하여 m의 이메일을 update 문자열로 변경

	}

	public void deleteMember(String userId) {
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				mem[i] = null;
				memberCount--;
			}
		}
		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		// 실행 시 NullPointerException 발생할 수 있음 -> 왜 그런지 생각해보고 해결하시오
		// memberCount 1 감소
	}

	public Member[] sortIdAsc() {
		Member[] copy = mem.clone();
		Member temp = null;

		for(int i = 0; i<memberCount; i++) {
			for(int j =0; j<i; j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId())==-1) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}

	public Member[] sortIdDesc() {
		Member[] copy = mem.clone();
		Member temp = null;

		for(int i = 0; i<memberCount; i++) {
			for(int j =0; j<i; j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId())==1) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		
		return copy;
		// 위와 동일한 방식이지만 내림차순으로 정렬 후 주소 값 리턴
	}

	public Member[] sortAgeAsc() {
		Member[] copy = mem.clone();
		Member temp = null;
		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() > copy[j].getAge()) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;

				}
			}
		}
		return copy;

	}

	public Member[] sortAgeDesc() {
		Member[] copy = mem.clone();
		Member temp = null;
		
		for (int i = 0; i < memberCount; i++) {
			for (int j =0; j < i; j++) {
				if (copy[i].getAge() < copy[j].getAge()) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;

				}
			}
		}

		return copy;
		// 위와 동일한 방식이지만 내림차순으로 정렬 후 주소 값 리턴

	}

	public Member[] sortGenderDesc() {
		Member[] copy = mem.clone();
		Member temp = null;
		
		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				int num = 0;
				if (copy[i].getGender() > copy[j].getGender()) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;

				}
			}
		}
		return copy;
		// 위와 동일한 방식이지만 성별 별 내림차순으로 정렬 후 주소 값 리턴
		// (남여 순으로 정렬)
	}
}
