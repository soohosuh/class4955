package todo.controller;

import java.sql.Connection;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;

public class TodoUpdateService {
	
	TodoDAO dao;
	
	private TodoUpdateService() {
		this.dao = TodoDAO.getInstance();
	}
	
	private static TodoUpdateService service = new TodoUpdateService();
	
	public static TodoUpdateService getInstance() {
		return service;
	}
	
	// TodoDTO 데이터를 받고
	// dao update 메소드를 전달해서 처리
	
	public int modify(TodoDTO todo) {
		Connection conn = null;
		int result =0;
		
		
	}
	
	
	
	
	
	
	
}
