package chapter12;

import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class SerializableTest {
	
	public static void main(String[] args) {
		// 객체 저장
		Person person = new Person("KING", 20);
		String msg = "안녕하세요";
		
		ObjectOutputStream outputStream = null;
		
		try {
			FileOutputStream fos = new FileOutputStream("instanceData.ser");
			
			outputStream = new ObjectOutputStream(fos);
			
			outputStream.writeObject(person);
			outputStream.writeObject(msg);
			
			System.out.println("저장");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
