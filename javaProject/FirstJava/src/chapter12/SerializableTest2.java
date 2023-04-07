package chapter12;

import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class SerializableTest2 {
	
	public static void main(String[] args) {
		// 객체 저장
				Person person = new Person("KING", 20);
				String msg = "안녕하세요";
		
		ObjectInputStream inputStream = null;
		
		try {
			FileInputStream in = new FileInputStream("instanceData.ser");
			
			inputStream = new ObjectInputStream(in);
			
			// Person p = (Person) inputStream.readObject();
			Person p = (Person) inputStream.readObject();
			String newStr = (String) inputStream.readObject();
			
			
			p.tell();
			System.out.println(newStr);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
		}
		
		
		
	}

}
