package Chapter07;

public class Male extends Person {

	int number;
	
	public Male(String name, int age) {
		super(name, age);
		number = 975433;
		
	}
	
	
	void call(){
		super.call();
		System.out.println("이사람의 주민번호는 " + number + "입니다.");
	}
	

}
