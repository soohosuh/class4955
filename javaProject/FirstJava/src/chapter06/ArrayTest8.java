package chapter06;

public class ArrayTest8 {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{100, 80, 40},
				{60, 70, 80}
		};
		
		// 2차원 배열은 1차원 배열들을 요소로 가지는 배열
		// arr[0] => 1차원 배열을 가지는 배열 변수
		// arr[1] => 1차원 배열을 가지는 배열 변수
		
		for(int[] temp : arr) {
			// int[] temp = {100, 80, 40};
			// int[] temp = {60, 70, 80};
			for(int num : temp) {
				System.out.println(num + "\t");
			}
			System.out.println();
			
			
		}

		
		
		
	}

}
