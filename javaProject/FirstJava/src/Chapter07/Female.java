package Chapter07;

public class Female extends Person {

	int number2;
	
	public  Female(String name, int age) {
		super(name, age);
		number2 = 45566;
	}
	
	void call() {
		super.call();
		System.out.println("이사람의 주민번호는 " + number2 + "입니다.");
	}
	
	
	

}
