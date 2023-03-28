package chapter05;

public class ModifierPrivate {
	
	private String name;
	private int age;
	
	public ModifierPrivate(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	// 은닉된 변수들은 정해진 메소드를 통해서 엑세스, 설정하게 한다!
	// Getter / Setter
	
	// Getter
	public String getName() {
		return this.name;
	}
	// Setter	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void tell() {
		System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
	}
	

}
