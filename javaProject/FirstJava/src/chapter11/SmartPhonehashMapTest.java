package chapter11;

import java.util.HashMap;
import java.util.Set;

public class SmartPhonehashMapTest {

	public static void main(String[] args) {
		
		HashMap<String ,SmartPhone> hashMap = new HashMap<>();
		
		SmartPhone p = new SmartPhone("Spring", "010-1111-2222"); 
		hashMap.put("ver", p); // p.getPhoneNumber() = "010-1111-2222" = "ver"
		
		SmartPhone p2 = new SmartPhone("SON", "010-1111-2222"); 
		hashMap.put("programName", p2);
		
		System.out.println(hashMap.get("ver"));
		System.out.println(hashMap.get("programName"));
		
		System.out.println("------------------------");
		Set<String> keySet = hashMap.keySet();
		for(String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName));
		}
		
		
		

	}

}
