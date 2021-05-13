package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;

public class MemberView {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberView() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {

		System.out.println("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력 : ");
		String pwd = sc.nextLine();
		
		if (mc.login(id, pwd) == 1) {
			while (true) {
				System.out.println(" === 회원 프로그램 ===");
				System.out.println("1. 내 정보 보기 ");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기 ");
				System.out.println("9. 프로그램 종료하기 ");

				System.out.print("메뉴 번호 선택 : ");
				int num = sc.nextInt();
				sc.nextLine();
				
				switch (num) {
				case 1:
					System.out.println(mc.readInfo().information());
				break;
				case 2:
					System.out.println("나이 : " + mc.readAge());;
					break;
				case 3:
					System.out.println("수정할 키를 입력하시오 : ");
					double height = sc.nextDouble();
					mc.updateHeight(height);
					break;
				case 9:
					System.out.println("프로그램이 종료됩니다.");
					return;
				default :
					System.out.println("번호를 잘못 눌렀습니다.");
				}
			}

		} else {
			System.out.println("로그인 실패 ---프로그램 종료");
			return;
		}

	}

	public void updateHeight() {

	}
}
