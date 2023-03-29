package chapter06;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		
	// 배열의 선언
	int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
	
	// 배열의 생성
	scores = new int[15]; // int  타입의 요소 10개를 가지는 배열 인스턴스 생성
	
//	for(int i=0; i<scores.length; i++) {
//		System.out.println(scores[i]);
//	}
//	
//		System.out.println("========");
//	
//	
	
	// 배열 요소의 참조
	// 배열이름[index]
	// index => 0 ~ 개수(배열요소의)-1
	// 요소의 개수 => 배열변수.length
	
	scores[0] = 60;
	scores[1] = 70;
	scores[2] = 80;
	scores[3] = 90;
	scores[4] = 50;	
	scores[5] = 40;
	scores[6] = 30;
	scores[7] = 20;
	scores[8] = 10;
	scores[9] = 66;
	scores[10] = 66;
	scores[11] = 66;
	scores[12] = 66;
	scores[13] = 44;
	scores[14] = 66;
	resultPrint(scores);
	
	
	
	
	}
	
	// 점수를 저장하고 있는 배열을 전달받아 총점과 평균값을 출력하는 메소드
	static void resultPrint(int[] arr) { // int[} arr = scores;
		
		// 전달 받은 배열은 : int 타입의 배열이다! size 제약은 없다
		int sum = 0;
		float avg = 0.0f;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		avg = sum/(float)arr.length;
		System.out.println("================");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println();
		
	}
	
	
	
	
	
	
	
//	// 총합
//	int sum = 0;
//	// 평균 값
//	float avg = 0.0f;
//	
//	// System.out.println(scores[1]);
//	// index => 0~9
//	for(int i=0; i<scores.length;/*i<10*/ i++) {
//		System.out.println(scores[i]);
//		// 합의 연산
//		sum = sum + scores[i];
//	}
//	
//	avg = sum/(float)scores.length;
//	//avg = sum/10f;
//	
//	System.out.println("총점 : " + sum);
//	System.out.println("평균 : " + avg);
//	
//	
	
	
	
}



