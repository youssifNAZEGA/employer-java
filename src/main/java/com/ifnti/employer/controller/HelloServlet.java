package com.ifnti.employer.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response
			)throws ServletException, IOException {
		request.setAttribute("message", "youssif bienvenu");
		request.getRequestDispatcher(
				"/WEB-INF/views/hello.jsp"
				).forward(request, response);
		
	}
}
