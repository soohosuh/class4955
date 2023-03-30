package Chapter07;

public class SmartPhone2 extends Phone {
	
	String model;
	
	
	// 상위클래스에 매개변수가 있는 생성자가 있다면 상위클래스의 멤버를 초기화 할 데이터를 받아서
	// 상위 클래스의 생성자를 호출해 주어야 한다!
	// 현재 클래스의 멤버를 초기화 한다!
	public SmartPhone2(String phoneNumber, String model) {
		// 상위 클래스의 생성자를 호출
		super(phoneNumber);
		// 현재 클래스의 인스턴스 변수의 초기화
		this.model = model;
	}
	void game() {
		super.call();
		System.out.println(model + " 게임을 합니다.");
	}
	public static void main(String[] args) {
		
		SmartPhone2 smartPhone = new SmartPhone2("010-1111-2222", "IOS");
		
		smartPhone.game();
	}

}
