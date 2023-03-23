package Chapter04;

public class IfTest2 {

	public static void main(String[] args) {
		
		// score 변수의 값을 60 이상인지를 비교
		// 60점 이상일 때
		// score 변수의 값을 60 이상인지를 비교 값이 false 일 때
		// 60점 이상이 아닐 때 즉, 60점 미만일 때
		int score = 70;
		
		if(score >= 60) {
			//score의 값이 60점 이상이다
		System.out.println("PASS");
		}else {System.out.println("FAIL"); }
		
		int age = 20;
		if(age>19) {
			System.out.println("투표가 가능합니다");
		} else {System.out.println("아직 투표권이 없습니다");
		}
		
		//짝수/홀수 판단하는 프로그램
		int num = 5;
		if(num%2 == 1) {
			//나머지가 1
			System.out.println("홀수");
			}else {
				//나머지가 0
				System.out.println("짝수");
			}
	
	}

}
