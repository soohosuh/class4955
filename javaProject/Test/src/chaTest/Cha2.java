package chaTest;

public class Cha2 {

	public static void main(String[] args) {
		// for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력
				
		int result = 1;
		for(int i=1; i<=10; i++) {
			result *= i;
			//result = result * i;
		}System.out.println("1부터10까지곱한값"+"="+result);
		

	}

}
