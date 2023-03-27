package chapter05;

public class ClassMethod {
	
	int iv = 10; // 인스턴스 변수
	
	static int cv = 30; // 클래스 변수
	
	// 인스턴스 메소드
	void printNumber1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void printNumber2() {
		System.out.println("ClassMethod");
		
		
		//printNumber1();
		
		ClassMethod cm = new ClassMethod();
		System.out.println(cm.iv);
		cm.printNumber1();
	}
	
	public static void main(String[] args) {
		
		//클래스 메소드의 호출 : 클래스 이름.메소드이름()
		ClassMethod.printNumber2();
		
	}
	

}
