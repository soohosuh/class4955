package Chapter07;

public class Person {
	
	//1. Person 이라는 클래스를 정의해봅시다.
	//   ① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
	//   ② 인사하는 메소드를 정의해봅시다.
	//     “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.

	String name;
	int age;
	
		
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
		
	void call(){
	System.out.println("안녕하세요. 저는 " + name + "입니다." + age + "살 입니다.");
	}
	
	
	
	
	
	

}
