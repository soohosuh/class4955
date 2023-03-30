package Chapter07;

public class CassArray {

	public static void main(String[] args) {
		
		// 상위 타입의 배열 인스턴스 생성
		Phone[] phones = new Phone[5];
		
		phones[0] = new AndroidPhone("011-1111-1111");
		phones[1] = new IPhone("010-9999-9999");
		phones[2] = new IPhone("010-2222-2222");
		phones[3] = new AndroidPhone("011-3333-3333");
		phones[4] = new AndroidPhone("011-4444-4444");
		
		for(Phone phone: phones) {
			phone.call();
		}
		
		
		

	}

}
