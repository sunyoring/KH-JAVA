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
		switch (menu) {
		case 1:
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getUserId().equals(m.getUserId())) {
					mem[i].setUserPwd(update);
				}
			}
			break;
		case 2:
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getUserId().equals(update)) {
					mem[i].setName(update);
				}
			}
			break;
		case 3:
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getUserId().equals(update)) {
					mem[i].setEmail(update);
				}
			}
			break;
		default:
			System.out.println("메뉴를 잘못 선택하였습니다. ");
			break;
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
		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(), System.arraycopy() 둘 중 하나 사용해서 복사)
		Member[] copy = mem.clone();

		// copy 배열을 아이디 별 오름차순 정렬 진행
		// --> HINT : String 클래스의 compareTo() 메소드 활용
		// copy 주소 값 리턴
		return copy;
	}

	public Member[] sortIdDesc() {
		return mem;
		// 위와 동일한 방식이지만 내림차순으로 정렬 후 주소 값 리턴
	}

	public Member[] sortAgeAsc() {
		Member[] copy = mem.clone();
		Member[] temp = new Member[1];
		for (int i = 0; i < copy.length; i++) {
			for (int j = i + 1; j < i; j++) {
				if (copy[i].getAge() > copy[j].getAge()) {
					temp[0] = copy[i];
					copy[i] = copy[j];
					copy[j] = temp[0];

				}
			}
		}
		return copy;

	}

	public Member[] sortAgeDesc() {
		for (int i = 0; i < mem.length; i++) {
			for (int j = i + 1; j < i; j++) {
				if (mem[i].getAge() < mem[j].getAge()) {
					Member temp = mem[i];
					mem[i] = mem[j];
					mem[j] = temp;

				}
			}
		}

		return mem;
		// 위와 동일한 방식이지만 내림차순으로 정렬 후 주소 값 리턴

	}

	public Member[] sortGenderDesc() {

		for (int i = 0; i < mem.length; i++) {
			for (int j = i + 1; j < i; j++) {
				int num = 0;
				if (mem[i].getGender() > mem[j].getGender()) {
					Member temp = mem[i];
					mem[i] = mem[j];
					mem[j] = temp;

				}
			}
		}
		return mem;
		// 위와 동일한 방식이지만 성별 별 내림차순으로 정렬 후 주소 값 리턴
		// (남여 순으로 정렬)
	}
}
