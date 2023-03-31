package Chapter07.exam;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Male m1 = new Male("손흥민", "991111-1000000", "축구선수입니다.");
		m1.printGreeting();
		
		Person p1 = (Person)m1;
		p1.printGreeting();
		// p1.hello();
		
		Person p2 = new Female("이영자", "540303-2000000");
		p2.printGreeting();
	}

}
