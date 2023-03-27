package chapter05;

public class ClassVariableMain {
	
	public static void main(String[] args) {
	
		System.out.println(ClassVariable.name);
		System.out.println(ClassVariable.age);
		
		ClassVariable cv = new ClassVariable();
		cv.tellName();
		cv.tellAge();
		
		
	}
	

}
