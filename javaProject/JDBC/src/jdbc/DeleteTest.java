package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임);
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection 객체를 생성 : 연결 정보
			// jdbcUrl
			// oracle 연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbUrl, "hr", "tiger");
			
			// 트렌젝션 설정
			conn.setAutoCommit(false);
			
			//Mysql 연결
			//String dbUrl = "jdbc:mysql://localhost:3306/project";
			//Connection conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");
			
			// 3. Statement / PreparedStatement => sql 실행 요청 메소드
			// insert Sql
			String sql = "delete from dept where deptno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 50);
			
			
			int result = pstmt.executeUpdate();
			
			if(result==1) {
				System.out.println("데이터가 삭제 되었습니다");
			}
			
			// 완료 commit
			conn.commit();
			
			} 
			catch (SQLException e) {
				//System.out.println("연결 실패");
				
				if(conn != null) {
					try {
						conn.rollback();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				e.printStackTrace();
			} finally {
				try {
				if(pstmt != null) {
				pstmt.close();
				
			}
				if(conn != null) {
					conn.close();
				}
				}catch (Exception e) {
					e.printStackTrace();
				}
			
		 
				
		
		
		
		
		
		

	}

}
}