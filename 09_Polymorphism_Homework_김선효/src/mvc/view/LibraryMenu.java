package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryMenu {

	private LibraryManager le = new LibraryManager();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		// LibraryManager의 insertMember() 메소드에 전달
		System.out.println("이름 :");
		String name = sc.nextLine();
		System.out.println("나이 :");
		int age = sc.nextInt();
		System.out.println("성별 :");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		Member mem = new Member(name, age, gender);
		le.insertMember(mem);

		while (true) {
			System.out.println("==== 메뉴 ===="); // 무한 반복 실행
			System.out.println("1. 마이페이지"); // LibraryManager의 myInfo() 호출한 후 그 결과값 출력
			System.out.println("2. 도서 전체 조회"); // LibraryMenu의 selectAll() 호출
			System.out.println("3. 도서 검색"); // LibraryMenu의 searchBook() 호출
			System.out.println("4. 도서 대여하기"); // LibraryMenu의 rentBook() 호출
			System.out.println("0. 프로그램 종료하기");

			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println(le.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();

				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다. 다시 눌러주세요");
				break;
			}

		}
	}

	public void selectAll() {
		// LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
		Book[] bList = le.selectAll();

		for (int i = 1; i < bList.length; i++) {

			System.out.println(i + "번 도서 : " + bList[i].toString());

		}
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력  대여할 때 도서번호를 알기 위해
//			ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true

	}

	public void searchBook() {
		sc.nextLine();
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		le.searchBook(keyword);
		Book[] searchList = le.searchBook(keyword);

		for (int i = 0; i < searchList.length; i++) {
			if(searchList[i]!=null) {
				System.out.println(searchList[i].toString());
			}
		}

	}

	public void rentBook() {
		selectAll();

		System.out.println("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		int result = le.rentBook(num);
		if (result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가입니다.");
		} else if (result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.마이페이지를 통해 확인하세요");
		} else {
			System.out.println("해당하는 책이 없습니다.");
		}

	}
}
