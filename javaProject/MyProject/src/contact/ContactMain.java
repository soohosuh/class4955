package contact;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact c = new Contact(
				"손흥민", 
				"010-1111-2222", 
				"son@gmail", 
				"london", 
				"20230319", 
				"친구");
		
		System.out.println("이름 : " + c.getName());
		System.out.println("전화번호 : " + c.getPhoneNumber());
		System.out.println("이메일 : " + c.getEmail());
		System.out.println("주소 : " + c.getAddress());
		System.out.println("생일 : " + c.getBirthday());
		System.out.println("그룹 : " + c.getGroup());
		
		System.out.println("----------");
		c.printData();
		
		c.setPhoneNumber("010-9999-8888");
		c.setEmail("sony@naver");
		c.setAddress("seoul");
		c.setBirthday("20231111");
		
		System.out.println("-------------------");
		c.printData();

	}

}
