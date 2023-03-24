package Chapter04.exam;

public class Exam04 {

	public static void main(String[] args) {
		// 문제 4. SwitchBreak.java를 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.
		
		int key = 3;
		
//		switch(key) {
//		case 1: // key == 1
//			System.out.println("AAA");
//			break;
//		case 2: // key == 2
//		    System.out.println("BBB");
//		    break;
//		case 3: // key == 3
//			System.out.println("CCC");
//			break;
//	    default: // else
//	    	System.out.println("DDD");
//		}
		
		if(key==1) {
			System.out.println("AAA");
		} else if(key==2) {
			System.out.println("BBB");
		} else if(key==3) {
			System.out.println("CCC");
		} else {
			System.out.println("DDD");
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
