package test;

public class Membertest {
	
	String name;
	String phoneNumber;
	String major;
	String grade;
	String email;
	String birth;
	String address;
	
	public Membertest(String name, String phoneNumber, String major, String grade, String email, String birth, String address) {
		
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.major = major;
	this.grade = grade;
	this.email = email;
	this.birth = birth;
	this.address = address;
	}
	
	public Membertest(String name, String phoneNumber, String major, String grade, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		
	}
	void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
				
		
	}

}
