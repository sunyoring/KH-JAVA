package com.kh.chap01_list.part02_list.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part02_list.model.vo.Music;

public class Run {

	public static void main(String[] args) {

		//제니릭스<> 사용 이유 :
		//1.명시된 타입의 객체만 저장하도록 제한을 두기 위해
		//2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 형변환 하는 절차를 없애기 위해
		
		//E -> Element : 리스트에 담길 요소 (객체)
		ArrayList<Music> list = new ArrayList<Music>(3);
		
		//1.add(E e) : 리스트의 끝에 인스턴스 데이터를 추가하는 메소드(내부적으로 사이즈를 검사한 후 수용가능 한 범위이면 추가 넘어가면 
//													   						자동으로 사이즈를 늘려주고 추가함.)
		list.add(new Music("인연","이선희"));
		list.add(new Music("아름다운 강산","이선희"));
		list.add(new Music("알고싶어요","이선희"));
//		list.add("끝"); : 제네릭스 <> 사용으로 여기서는 명시 된 객체만 넣을 수 있다.
		
		
		System.out.println(list);
	
		
		//2. add(index, E e) : 인덱스를 지정하여 해당 인덱스에 인스턴스를 추가하는 메소드(내부적으로 기존에 있는 것은 해당 인덱스에 값이 삽입되면서 기존 값들이 뒤로 밀려난다.)
		list.add(2, new Music("그 중에 그대를 만나","이선희"));
		System.out.println(list);
		
		//3. set(index, E e) : 해당 인덱스 자의 값을 e로 변경하는 메소드
		list.set(0, new Music("여우비","이선희"));
		System.out.println(list);

		
		//4. size() : 리스트안에 몇 개의 데이터가 있는 지 반환
		System.out.println(list.size());
		
		//5. remove(index) : 해당 인덱스 값을 삭제하고 뒤 값들을 한 칸씩 당겨온다. 크기 자동조절 
//		list.remove(1);
//		System.out.println(list);
//		System.out.println(list.size());
//		
		list.remove(new Music("여우비","이선희"));
		System.out.println(list);
		System.out.println(list.size());
		
		
		//6.get(int index) : 해당 인덱스의 인스턴스 가져오기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		
		
		//7. subList(int index1, int index2) : 추출해서 새로운 List로 반환
		List sub = list.subList(0, 2);
		
		System.out.println(sub);

		//8. addAll (Collection c) : 컬렉션을 통째로 뒤에 추가하는 메소드
		list.addAll(sub);
		System.out.println(list);
		System.out.println(list.size());
	}

}
