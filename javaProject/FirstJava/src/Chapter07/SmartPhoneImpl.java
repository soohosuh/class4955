package Chapter07;

public class SmartPhoneImpl extends Phone {
	
	String model;

	public SmartPhoneImpl(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	@Override
	void call() {
		super.call();
		System.out.println("이어팟을 이용해서 통화합니다.");
	}
	
	public static void main(String[] args) {
		
		SmartPhoneImpl phone = new SmartPhoneImpl("00-0000-0000", "google");
		
		phone.call();
	}

	

	
	
	

}
