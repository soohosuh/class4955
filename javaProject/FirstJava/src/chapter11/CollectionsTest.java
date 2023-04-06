package chapter11;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsTest {
	
	public static void main(String[] args) {
		
		List<Integer> lottoNumbers = new ArrayList<Integer>();
		for(int i=0; i<6; i++) {
			int n = new Random(System.nanoTime()).nextInt(45)+1;
			lottoNumbers.add(n);
		}
		
		System.out.println("최초 입력 데이터");
		displayList(lottoNumbers);
		
		System.out.println("최대 값 : " + Collections.max(lottoNumbers));
		System.out.println("최소 값 : " + Collections.min(lottoNumbers));
		
		Collections.sort(lottoNumbers);
		displayList(lottoNumbers);
		
		Collections.reverse(lottoNumbers);
		displayList(lottoNumbers);
		
		Collections.shuffle(lottoNumbers);
		displayList(lottoNumbers);
		
	}
	
	static <E> void displayList(List<E> list) {
		System.out.println("-----------------------------");
		for(E num : list) {
			System.out.println(num);
		}
		
	}
	

}
