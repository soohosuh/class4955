package chaTest;

public class Cha6 {
	
	public static void main(String[] args) {
		
		//num<0 이라면 "0 미만" 출력
				//0<=num<100이라면 "0이상 100미만" 출력
				//100<=num<200이라면 "100이상 200미만" 출력
				//200<=num<300이라면 "200이상 300미만" 출력
				//300<=num 이라면 "300이상" 출력
				//for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력
				//for 문을 이용하여 구구단 중 7단을 출력
//		for(int i=7; i==7; i++) {
//			System.out.println();
//			for(int j=1; j<=10; j++) {
//				System.out.print(i + "x" + j + "=" + i*j + "\t");
//			}
//		}
		
		for(int i=1; i<10; i++) {
			System.out.print("5x"+i+"="+5*i+"\t");
			if(0==i%3 && 0==i%5) {
						System.out.println();		
			}
		}

	}

}
