package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		
		try {
			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임);
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection 객체를 생성 : 연결 정보
			// jdbcUrl
			
			// oracle 연결
			//String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			//Connection conn = DriverManager.getConnection(dbUrl, "hr", "tiger");
			
			//Mysql 연결
			String dbUrl = "jdbc:mysql://localhost:3306/project";
			Connection conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");
			
			// 3. Statement / PreparedStatement => sql 실행 요청 메소드
			// insert Sql
			String sql = "insert into dept values (?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 50);
			pstmt.setString(2, "개발팀");
			pstmt.setString(3, "서울");
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("입력되었습니다.");
			}
				
			pstmt.close();
			conn.close();
			
				
			} 
			catch (SQLException e) {
				System.out.println("연결 실패");
				e.printStackTrace();
			}
			
		 
		
		
		
		
		
		
		

	}

}
