package Chapter04.exam;

public class Exam11 {
	public static void main(String[] args) {
		// ContinueBasic.java의 내부에 존재하는 while 문을 for 문으로 변경하여 작성

		int count = 0;

		for (int i = 1; i < 100; i++) {
//			if(i%5 !=0 || i%7 != 0) { // i%5==0 && i%7==0
//				continue;
//			}
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
				count++;
			}

		}
		System.out.println("count : " + count);
	}
}
