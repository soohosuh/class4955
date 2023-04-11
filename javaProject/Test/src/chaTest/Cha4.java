package chaTest;

public class Cha4 {
	
	public static void main(String[] args) {
		// n=1일 때 "현재 인원은 1명 입니다"
		// n=2일 때 "현재 인원은 2명 입니다"
		// n=3일 때 "현재 인원은 3명 입니다"
		// n>3일 때 "현재 많은 사람이 있습니다"
		// if 문으로 작성하시오
		int n=5;
		if(n==1) {
			System.out.println("현재 인원은 1명 입니다");
		}else if(n==2) {
			System.out.println("현재 인원은 2명 입니다");
		}else if(n==3) {
			System.out.println("현재 인원은 3명 입니다");
		}else {
			System.out.println("현재 많은 사람이 있습니다");
		}
		
		
		
		
	}


}