package com.test.lesson01;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex04")
public class GetMethodEx04 extends HttpServlet {
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		// 한글 깨짐 방지
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		
		// 출력
		PrintWriter out = response.getWriter();
//		out.println("userId:" + userId);
//		out.println("name:" + name);
//		out.println("birth:" + birth);
//		out.println("email:" + email);
		
		// 테이블로 출력
		out.println("<html><head><title>회원 정보</title></head><body>");
		out.println("<table border=1>");
		out.println("<tr><th>아이디</th><td>" + userId + "</td>");
		out.println("<tr><th>이름</th><td>" + name + "</td>");
		out.println("<tr><th>생년월일</th><td>" + birth + "</td>");
		out.println("<tr><th>이메일</th><td>" + email + "</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body></html>");
		
		
	}
}