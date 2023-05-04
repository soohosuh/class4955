package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.domain.MemberDTO;
import todo.util.ConnectionProvider;

public class MemberDAO {
	
	// 로그인 처리를 위한 select
	// uid, pw 비교해서 처리 => MemeberDTO
	
	public MemberDTO selectByUidPw(Connection conn, String uid, String pw) {
		
		// 반환 할 결과 데이터 변수 선언
		MemberDTO memberDTO = null;
		
		// sql 실행을 위한 PreparedStatement 선언 => try{}finally(close())
		PreparedStatement pstmt = null;
		// select 결과 테이블 저장
		ResultSet rs = null;
		
		// select sql
		String sql = "select idx, uid, uname, uphoto from member where uid=? and pw=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			// set
			pstmt.setString(1, uid);
			pstmt.setString(2, pw);
			
			// rs
			rs = pstmt.executeQuery(); // 결과 행의 개수 => 0 or 1
			
			// if => MemberDTO
			if(rs.next()) {
				memberDTO = new MemberDTO(
						rs.getInt("idx"),
						rs.getString("uid"),
						rs.getString("uname"),
						rs.getString("uphoto")
						);
			}
						
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
		  }catch (SQLException e) {
			  e.printStackTrace();
		  }
		}
		
		
		return memberDTO;
		
	}
	
	public static void main(String[] args) throws SQLException {
		
		MemberDAO dao = new MemberDAO();
		Connection conn = ConnectionProvider.getConnection();
		
		MemberDTO member = dao.selectByUidPw(conn, "cool", "1111");
		System.out.println(member);
	}
	
	
}
