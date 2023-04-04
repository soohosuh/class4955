package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chacha {
	
	// Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다.
	// 이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다. 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력하세요.");
		int num=0;
		try {num = sc.nextInt();
			System.out.println();
		}catch(InputMismatchException e){
			System.out.println("다시 입력하세요.");
			
		}
		System.out.println(num + "정상 입력값입니다.");

		}
	
}
	


