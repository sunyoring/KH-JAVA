package com.kh.chap04_map.run;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04_map.model.vo.Student;

public class Run {
	private HashMap<String, Student> stdMap = new HashMap<>();

	public static void main(String[] args) {

		/*
		 * Map : 데이터를 저장할때 각각의 자료를 구분지을수 있는 고유의 값을 정하여 해당값으로 접근할수 있는 실제 객체를 묶어 함꼐 관리하는
		 * 자료 구조 클래스. 해당객체를 저장할때 key(고유의값 ) 은 set 의 특성으로 value(실제객체)는 List 의 특성으로 관리한다.
		 * 종류는 크게 HashMap, HashTable(예전버전 -HashMap과 동일 스레드세이프가있다 ), TreeMap, Properties
		 * 등이 있다.
		 * 
		 * - map은 key와 value로 구분되어 있고 이걸 로그인 할 때 ID와 PWD처럼 생각하면 편하다. (ID는 중복 불가능, 즉 Set과
		 * 관련이 있음을 알 수 있다.)
		 * 
		 * - key와 value를 묶어서 Entry라고 한다.
		 * 
		 * - key값은 보통 String으로 하는데, 이유는 int를 쓰면 ArrayList와 차이가 없기 때문이다.
		 */

		Run m = new Run();
		m.test1();
	}

	private void test1() {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();

		map.put(1, "a");
		map.put(3, "4");
		map.put(22, "6");
		map.put(4, "22");

		System.out.println(map); // 순서 보장 안됨

		stdMap.put("커피", new Student(1, "최선호"));
		stdMap.put("도넛", new Student(2, "김무냥"));
		stdMap.put("라면", new Student(3, "옥고미"));

		System.out.println("덮어쓰기 전  : " + stdMap);

		// key는 중복되지 않는 set과 같다.
		// 뒤에 추가되는 값이 기존의 값을 덮어쓴다.
		stdMap.put("커피", new Student(1, "우야잉"));
		System.out.println("같은 키에 다른 값으로 덮어쓴 후  : " + stdMap);

		// value는 중복이되도 상관없다.
		stdMap.put("젤리", new Student(1, "우야잉"));
		System.out.println("같은 값을 다른 키로 덮어쓴 후  : " + stdMap);

		// value 뽑기
		Student s = stdMap.get("도넛");
		System.out.println("도넛으로 검색한 학생 : " + s);

		Student removed = stdMap.remove("커피");
		System.out.println("삭제 된 학생 : " + removed);

		System.out.println(stdMap);

		// 출력
		// 1. keySet
		// value를 얻고자 할 때 Set인 키들을 뽑아와서 Set형에 담아서 출력
		// key 값을 set<String>으로 만들어서 iterator로 뽑는다.

		System.out.println("**********key**********");

		Set<String> kset = stdMap.keySet(); // stdMap에 있는 키들만 keySet컬렉션에 담았다. (키들의 집합)

		Iterator<String> iter = kset.iterator(); // keySet에 있는 key값들을 Iterator반복자에 담는과정
		while (iter.hasNext()) {
			String key = iter.next(); // 있으면 키를 담고
			Student val = stdMap.get(key); // 키로 값을 얻어온다.

			System.out.println(key + "	" + val);

		}

		// 2. values 메소드 사용(값만추출)

		System.out.println("**********collection**********");
		Collection values = stdMap.values();

		Iterator iter1 = values.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		// 3. EntrySet
		// key와 value를 같이 얻어오가자 할 때 Map의 내부 인터페이스인 Entry타입을 이용
		// key와 value를 묶어서 Entry
		// entrySet : Map.Entry의 묶음모음
		System.out.println("**********Entry**********");
		Set<Entry<String, Student>> eSet1 = stdMap.entrySet();
		Iterator<Entry<String, Student>> it1 = eSet1.iterator();

		while (it1.hasNext()) {
			Entry<String, Student> entry = (Entry) it1.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
