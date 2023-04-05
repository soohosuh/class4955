package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		
		// 반복자 : Iterator<E> => Collection<E> 구현하는 객체들의 전체 참조목적으로 사용
		Iterator<Integer> itr = numbers.iterator();
		
		System.out.println("Iterator를 이용한 전체 참조");
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			int num = itr.next();
			System.out.println(100 + num);
		}
		
		
		System.out.println("-----------------------------------------");
		
		for(int n : numbers) {
			System.out.println(n);
		}
		
		// Collection<E> =>  List => ArrayList<E>
		// String 타입의 객체를 저장 => String 타입의 인스턴스를 참조한느 참조값을 저장
		LinkedList<String> list = new LinkedList<String>();
		
		// 인스턴스 저장 => 요소 저장, add()
		list.add("손흥민");
		list.add(new String("박지성"));
		list.add(new String("이강인"));
		
		// 데이터 참조 : get 
		// String name = list.get(10);
		String name = list.get(0);
		System.out.println(name);
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		System.out.println("----------");
		// 특정 위치의 요소 삽입
		list.add(1, "안정환");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// 저장된 요소의 개수 : size()
		System.out.println("저장된 이름의 개수 : " + list.size());
		System.out.println("index : 0 ~ " + (list.size()-1));
		
		// 반복문을 이용해서 일괄 처리
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + " : "+ list.get(i).charAt(0));
		}
		System.out.println("-----------------------------");
		for(String playerName : list) {
			System.out.println(playerName + " : " + playerName.charAt(2));
		}
		
		if(list.contains("손흥민")) {
			System.out.println("잘하자~!!!화이팅~!!!");
		}
		if(list.contains("안정환")) {
			// 안정환 선수는 이제 하차합니다
			list.remove("안정환");
			list.remove(1); // 안정환이 삭제되면서 쉬프트 되고 박지성이 삭제되는 상황
		}
		System.out.println("-----------------------------");
		for(String playerName : list) {
			System.out.println(playerName + " : " + playerName.charAt(2));
		}
		//전체 요소 삭제
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		
		
		
		
		
		
		
	}

}
