package Chapter04;

public class ForLoop2 {

	public static void main(String[] args) {
		
		// 행을 표현 => 외부 Loop
		for(int i=1; i<10; i++) {
			//System.out.println(i);
		// 열을 표현 => 내부 Loop
		for(int j=2; j<10; j++) {
			System.out.printf(j + "X" + i + "=" + i*j + "\t");
		}
		System.out.println();
		}

	}

}
