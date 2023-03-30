package Chapter07;

public class SmartPhone extends Phone {
	
	// 자식클래스 : 좁은의미, 기능의 확장
	
	String model;
	
	public SmartPhone() {
		super();
	}
	
	void game() {
		System.out.println(model + "게임을 합니다.");
	}
	
	
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		sp.phoneNumber = "010-1111-2222";
		sp.call();
		
		sp.model = "Google";
		sp.game();
		
		
	}
	
	
	
	

}
