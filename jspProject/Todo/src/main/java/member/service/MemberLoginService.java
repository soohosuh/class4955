package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import member.dao.MemberDAO;
import member.domain.MemberDTO;
import todo.util.ConnectionProvider;

public class MemberLoginService {
	
	MemberDAO dao;
	
	public MemberLoginService() {
		this.dao = new MemberDAO();
	}
	
	// id, pw 전달 받아서 Dao로 select 요청 => MemberDTO 반환
	public MemberDTO login(String uid, String pw) {
		
		MemberDTO member = null;
		Connection conn = null;
		
		
		try {
			// conn
			conn = ConnectionProvider.getConnection();
			
			// dao.selectByUidPw
			member = dao.selectByUidPw(conn, uid, pw);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		return member;
		
	}
	
	

}
