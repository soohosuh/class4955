package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.domain.TodoDTO;
import todo.service.TodoViewService;

@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {

	TodoViewService viewService;

	public TodoReadController() {
		this.viewService = TodoViewService.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("TodoReadController...doGet()...");
		// 회원의 로그인 여부를 확인 후 비로그인상태 -> 로그인 페이지로 이동
		HttpSession session = request.getSession();

		// 1. session 이 새로 만들어진 세션이 아니고 세션에 로그인 정보를 가지고 있다면 => 로그인 상태
		// 리디렉션 => 로그인 페이지
		// 2. 새로 만들어진 세션이거나 세션에 로그인 정보가 없다면
		if (session.isNew() || session.getAttribute("loginInfo") == null) {

			System.out.println("로그인 상태가 아니다!!");
			// 로그인 페이지로 리디렉션
			response.sendRedirect("/app/login");

			return;
		}

		// 쿠키값 확인
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("uname")) {
				System.out.println(c.getName() + "=" + c.getValue());
			}

		}

		// 상세보기 페이지는 get 방식의 요청에 화면을 보여주는 처리
		// 어떤 Todo의 데이터인지 식별할 수 있는 키 데이터 받아서 처리
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);

		// no 값으로 Service를 통해서 Todo 정보를 받아온다.
		TodoDTO todo = viewService.getTodo(no); // no = 2

		request.setAttribute("todo", todo);

//		String todo = "청소";
//		String duedate = "2023-05-05";
//		String complete = "done";
//
//		request.setAttribute("no", no);
//		request.setAttribute("todo", todo);
//		request.setAttribute("duedate", duedate);
//		request.setAttribute("complete", complete);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/read.jsp");
		dispatcher.forward(request, response);
	}

}
