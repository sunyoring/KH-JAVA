package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {

	private Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);

	public MemberController() {
		// TODO Auto-generated constructor stub
	}

	public int login(String id, String pwd) {
		if (mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
			return 1;
		} else {
			return 0;

		}
	}

	public Member readInfo() {

		return mem;
	}

	public int readAge() {
		
		String year = mem.getCitizenNo().substring(0, 1);
		int age = 2021 - Integer.parseInt(year) +1;
		return age;
	}



	public void updateHeight(double height) {
		mem.setHeight(height);
	}

}
