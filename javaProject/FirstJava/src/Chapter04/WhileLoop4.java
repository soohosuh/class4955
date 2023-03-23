package Chapter04;

public class WhileLoop4 {
	public static void main(String[] args) {
		
		// 1~10 출력
		int num = 1;
		
		while(num<=10) {
			
			num++;
			
			if(num%2==0) {
				continue;
			}
			
			System.out.println(num);
			
			//num += 2; // num = num +2;
			
		}
	}

}
