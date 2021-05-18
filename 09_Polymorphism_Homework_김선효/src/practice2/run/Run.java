package practice2.run;

import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.SmartPhone;
import practice2.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		// 2개의 객체를 저장할 수 있는 객체배열 생성 (SmartPhone타입)
		SmartPhone[] phone = new SmartPhone[2];
		// 각각의 인덱스에 GalaxyNote9, V40 객체 생성 (기본생성자 이용) --> 다형성
		// for문을 이용하여 phone 객체배열에 모든 인덱스를 참조.
		
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		
		for(int i = 0 ; i < phone.length ; i++) {
			phone[i].printMaker();
			phone[i].makeaCall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
		// printMaker() 호출
		// makeaCall() 호출
		// takeaCall() 호출
		// touch() 호출
		// charge() 호출
		// picture() 호출
		System.out.println(); // 한 줄 띄기
		}
		
	}

}
