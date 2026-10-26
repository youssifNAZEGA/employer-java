package com.ifnti.employer.controller;

import java.io.IOException;

import com.ifnti.employer.model.Employee;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
@WebServlet("/employee")
public class EmployerCreateServlet extends HttpServlet	{
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException , IOException{
		request.getRequestDispatcher(
				"/WEB-INF/employers/form.jsp"
				).forward(request, response);
	}
	
	
	@Override
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");
		String email = request.getParameter("email");
		String departement = request.getParameter("departement");
		
		if(prenom == null || prenom.isBlank()
				|| nom == null || nom.isBlank()
				||email == null || email.isBlank()
				||departement == null || departement.isBlank()) {
			response.sendError(
				HttpServletResponse.SC_BAD_REQUEST,
				"Tous les champs sont obligatoires."
			);
			return;			
		}
		Employee employee = new Employee(
			prenom.trim(),
			nom.trim(),
			email.trim(),
			departement.trim()
		);
		request.setAttribute("employee", employee);
		
		request.getRequestDispatcher(
				"/WEB-INF/employers/detail.jsp"
				).forward(request, response);
	}
}
