package test;
//1. Person 이라는 클래스를 정의해봅시다.
		//   ① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
		//   ② 인사하는 메소드를 정의해봅시다.
		//     “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
		//2. Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.
		//   ① 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
		//   ② 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
		//   ③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
		//   ④ Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
		//3. main()메소드를 정의해봅시다.
		//   ① Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.
		//   ② 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.
public class Person {
	// 인스턴스 변수 정의
	private String name;
	private String personNumber;
	
	// 생성자 정의
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}
	
	// Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}
		
	
	// 메소드 toString
	public String toSTring() {
		return "저는 " +name +"입니다. 주민번호는" + personNumber +"입니다.";
	}
	
}

class Male extends Person{
	
	// 인스턴스 변수 정의
	private String military;
	// 생성자 정의
	public Male(String name, String PersonNumber, String  military) {
		super(name,PersonNumber);
		this.military =  military;
	}
	// Getter Setter
	public String getMilitary() {
		return military;
	}
	public void setMilitary(String military) {
		this.military = military;
	}
	// toString 메소드 오버라이딩 
	@Override
	public String toString() {
		return super.toSTring() + military;
	}
	
}

class Female extends Person{
	
	// 인스턴스 변수 정의
	private String mairred;
	// 생성자 정의
	public Female(String name, String personNumber, String married) {
		super(name,personNumber);
		this.mairred = married;
	}
	// Getter Setter
	public String getMairred() {
		return mairred;
	}
	public void setMairred(String mairred) {
		this.mairred = mairred;
	}
	
	// toString 메소드 오버라이딩 
	@Override
	public String toString() {
		return super.toSTring() + mairred;
	}
}

class main {
	public static void main(String[] args) {
	
		Person person = new Person("권성준","324324-3423421");
		System.out.println(person);
		
		Male male = new Male("권성준","2342342-342342","군필입니다.");
		System.out.println(male);
		
		Female female = new Female("다다다","22222-3332","결혼");
		System.out.println(female);
		
	}
	
}

