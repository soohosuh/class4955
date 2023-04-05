package chapter11;

public class GenericMethodByType {
	
	public <T> void introduce(T t) {
		System.out.println("안녕하세요. " + t.toString());
	}
	
	public static void main(String[] args) {
		
		GenericMethodByType byType = new GenericMethodByType();
		
		byType.<String>introduce("1");
		byType.<Integer>introduce(1);
		byType.introduce("1");
		byType.introduce(true);
	}

}
