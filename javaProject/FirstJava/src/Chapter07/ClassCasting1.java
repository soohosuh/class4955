package Chapter07;

public class ClassCasting1 {
	
	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("010-1111-2222");
		
		Phone phone = new AndroidPhone("11");
		
		Phone p = new IPhone("222");
		
		Phone phone1 = (Phone)androidPhone;
		Phone phone2 = androidPhone; // 하위타입의 참조변수를 상위타입으로 변경은 생략 가능
		
		AndroidPhone phone3 = (AndroidPhone)phone;
		
		//AndroidPhone phone4 = (AndroidPhone)p; // new IPhone("222");
		
		IPhone iPhone = null;
		AndroidPhone androidPhone2 = null;
		
		if(p instanceof IPhone) {
			iPhone = (IPhone)p;
			iPhone.call();
		} else if(p instanceof AndroidPhone) {
			androidPhone2 = (AndroidPhone)p;
			androidPhone2.call();
		}
		
		
		
		
		
		
		
		
		
	}

}
