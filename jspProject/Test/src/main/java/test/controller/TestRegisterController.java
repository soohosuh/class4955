package test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todo/register")
public class TestRegisterController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TestRegisterController...doGet()...");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/test/registerForm.jsp");
		dispatcher.forward(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String test = request.getParameter("test");
		String dueDate = request.getParameter("duedate");
		System.out.println(test + " : " + dueDate);
		
		response.sendRedirect("list");
		
		
	}
	
	
	
	
	
	
	
	
	

}
