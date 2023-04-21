package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptInsertService {
	
	DeptDao dao;
	//생성자 superclass
	public DeptInsertService() {
		this.dao = DeptDao.getInstance();
	}
	
	private static DeptInsertService service = new DeptInsertService();
	
	public static DeptInsertService
	
	public int insertDept(Dept dept) {
		
		// RequestDept => dname, loc
		// 데이터 가공
		// Transaction
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			result = dao.insertDept(conn, dept);
			
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
		
		return result;
		
	}
	
	
	

}
