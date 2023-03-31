package Chapter07.exam;

public class Person {
	
	//  ① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
	private String name;
	private String personNum; // 987633-100000
	
	
	
	public Person(String name, String personNum) {
		super();
		this.name = name;
		this.personNum = personNum;
	}

	//  ② 인사하는 메소드를 정의해봅시다.
	//   “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
	public void printGreeting() {
		System.out.println("안녕하세요. 저는 " + name + "입니다. " +getAge()+ "살 입니다.");
	}
	
	// 주민번호를 통해서 나이를 계산해서 반환 메소드
	int getAge() {
		
		int age = 0;
		
		// 991111-1000000
		String year = personNum.substring(0, 2);
		char gender = personNum.charAt(7);
		
		// System.out.println(year + " : " + gender);
		
//		int age /*personYear*/ = 0;
		if(gender<'3') {
			// 1900 + year
			age = 2023 - (1900 + Integer.parseInt(year)) + 1;
		} else {
			// 2000 + year
			age = 2023 - 2000 + Integer.parseInt(year) + 1;
		}
		
//		age = 2023 - personYear + 1;
		
		return age;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person("tester","001122-3000000");
		
		System.out.println(p.getAge());
		//p.getAge();
	}
	
	
}
