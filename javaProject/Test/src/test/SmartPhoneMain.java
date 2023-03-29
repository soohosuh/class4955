package test;

public class SmartPhoneMain {
	
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		sp.add(10);
		System.out.println(sp.add(10, 20));
		System.out.println(sp.add(10.1f, 20.2f));
				
		
	}

}
