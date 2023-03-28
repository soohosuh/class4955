package chapter05.other;

import chapter05.ModifierProtected;

public class ModifierProtectedExtends extends ModifierProtected {
	
	// name, age, tell()
	
	public static void main(String[] args) {
		
		ModifierProtectedExtends mpe = new ModifierProtectedExtends();
		
		mpe.name = "이강인";
		mpe.age = 30;
		
		mpe.tell();
		
	}
	

}
