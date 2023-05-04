package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.domain.TodoDTO;

public class TodoDAO {
	
	public List<TodoDTO> selectAll(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<TodoDTO> list = null;
		
		String sql = "SELECT * FROM project.tbl_todo";
		list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				TodoDTO dto = new TodoDTO(rs.getInt("tno"), rs.getString("todo"), rs.getString("duedate"), rs.getBoolean("finished"));
				list.add(dto);
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return list;
	}
	

}
