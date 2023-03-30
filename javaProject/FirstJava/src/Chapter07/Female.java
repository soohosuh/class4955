package Chapter07;

public class Female extends Person {

	float height;

	public Female() {
		
	}

	public Female(String name, String pNumber, int age, float height) {
		super(name, pNumber, age);
		this.height = height;
	}
	
	@Override
	void printHello() {
		super.printHello();
		System.out.println("키는 " + height +"cm 입니다.");
	}
	

}
