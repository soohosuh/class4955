package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임);
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection 객체를 생성 : 연결 정보
			// jdbcUrl
			// oracle 연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "hr", "tiger");
			
			//Mysql 연결
			//String dbUrl = "jdbc:mysql://localhost:3306/project";
			//Connection conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");
			
			// 3. Statement / PreparedStatement => sql 실행 요청 메소드
			Statement stmt = conn.createStatement();
			
			// sql
			String sql = "select * from dept";
			
			// 4. select의 결과 데이터는 ResultSet 객체로 받는다.
			// select 실행 메소드 : executeQuery(String sql)
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5. ResultSet 객체에서 데이터 추출
			while(rs.next()) {
				//int deptno = rs.getInt("deptno");
				//String dname = rs.getString("dname");
				//String loc = rs.getString("loc");
				
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				
				System.out.println(deptno + "\t" + dname + "\t" + loc);
				
			}
				
			rs.close();
			stmt.close();
			conn.close();
				
				
			} 
			catch (SQLException e) {
				System.out.println("연결 실패");
				e.printStackTrace();
			}
		
		
		
		
		
		

	}

}
