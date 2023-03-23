package Chapter04;

public class ItTest4 {

	public static void main(String[] args) {
		// 특정 숫자의 판별 : 양수, 음수, 0
		
		int number = -3;
		
		// 양수 : 0 보다 큰 수 : number > 0 => 양수
		// 음수 : 0 보다 작은 수 : number < 0 => 음수
		// 0보다 크지도 작지도 않은 수 => 0
		
		if (number>0) {
			System.out.println("양수");
		} else if(number<0) {
			// number <= 0 &&
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
	

	}

}
