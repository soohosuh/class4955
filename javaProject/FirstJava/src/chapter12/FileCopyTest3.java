package chapter12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest3 {
	
	public static void main(String[] args) {
		
		// 원본파일 : 파일 데이터를 읽어와야한다!
		// 복사본 : 원파일의 데이터를 써야한다!
		
		try {
			InputStream in = new FileInputStream("D:\\test\\test.zip");
			// 필터스트림 사용시에는 기본 스트림이 필요!
			BufferedInputStream bin = new BufferedInputStream(in);
			
			OutputStream out = new FileOutputStream("D:\\test\\testcopy2.zip");
			// 필터스트림 사용시에는 기본 스트림이 필요!
			BufferedOutputStream bout = new BufferedOutputStream(out);
			

			int byteData = 0;
			
			while(true) {
				byteData = bin.read(); // 더이상 받아올 데이터가 없으면 -1
				if(byteData==-1) {
					break;
				}
				// 새로운 파일에 데이터를 쓴다!
				bout.write(byteData);
			}
			in.close();
			out.close();
			System.out.println("복사가 완료되었습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
