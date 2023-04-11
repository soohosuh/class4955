package chaTest;

public class Cha5 {
	
	public static void main(String[] args) {
		
		// while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.
		// 심화 - for문을 이용해서도 만들어보기
		int result =1;
		for(int i=1; i<100; i++) {
			result += i;
			//result+=i;
		} System.out.println(result);
		
		int num = 1;
		int sum = 0;
		while(num<100) {
			sum = sum + num;
			num++;
		}
		System.out.println(sum);
	
		
		
		
	}

}
