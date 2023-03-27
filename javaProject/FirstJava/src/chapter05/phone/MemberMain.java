package chapter05.phone;

public class MemberMain {
	
	public static void main(String[] args) {
		Member member1 = new Member("손흥민","son@gmail", 20, "010-1111-9999");
		Member member2 = new Member("박지성","park@gmail");
		
		member1.showData();
		System.out.println();
		member2.showData();
				
	}

}
