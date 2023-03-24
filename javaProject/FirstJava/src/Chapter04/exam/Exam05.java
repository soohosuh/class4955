package Chapter04.exam;

public class Exam05 {
	public static void main(String[] args) {
		//문제 5. 문제 2의 답안 코드를 switch 문으로 변경하여 보자. num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 나머지 조건에 대해 변경하세요.
		
		int num = 0;
		
		if (num < 0) {
			System.out.println("0 미만");
		} else {
			
			switch(num/100) {
			case 0 : // 0~99
				System.out.println("0 이상 100 미만");
				break;
			case 1 : // 100~199
				System.out.println("100 이상 200 미만");
				break;
			case 2 : // 200~299
				System.out.println("200 이상 300 미만");
				break;
			default : 
				System.out.println("300 이상");
			}
		}
		
		
	}

}
