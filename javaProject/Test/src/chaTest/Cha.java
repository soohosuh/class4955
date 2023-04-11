package chaTest;

import java.util.Scanner;

public class Cha {
	
	public static void main(String[] args) {
		
		//num<0 이라면 "0 미만" 출력
		//0<=num<100이라면 "0이상 100미만" 출력
		//100<=num<200이라면 "100이상 200미만" 출력
		//200<=num<300이라면 "200이상 300미만" 출력
		//300<=num 이라면 "300이상" 출력
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = 0;
		num = in.nextInt();
		
		if(num<0) {
			System.out.println("0 미만");
		}else if(num>=0 && num<100) {
			System.out.println("0이상 100미만");
		}else if(num>=1000 && num<200) {
			System.out.println("100이상 200미만");
		}else if(num>=200 && num<300) {
			System.out.println("200이상 300미만");
		}else {
			System.out.println("300이상");
		}
				
		
		
		
	
}
}