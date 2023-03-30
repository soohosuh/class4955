package Chapter07;


public class PersonMain {
		
public static void main(String[] args) {
		
		Male male = new Male("김", "990205-1000000", 25, "남자");
		Female female = new Female("박", "951010-2000000", 29, 165.3f);
		
		/*
		male.printHello();
		female.printHello();
		*/
		
		printPersonHello(male);
		printPersonHello(female);
		
	}
	
	public static void printPersonHello(Person person) {
		person.printHello();
	}
	
	
		}

