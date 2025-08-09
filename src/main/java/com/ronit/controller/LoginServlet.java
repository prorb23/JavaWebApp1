package com.ronit.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ronit.dao.UserDAO;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		UserDAO dao = new UserDAO();
		boolean valid = dao.validateUser(email, password);

		
		if(valid) {
			res.sendRedirect("success.jsp");
		}
		else {
			res.sendRedirect("error.jsp");
		}
	}
}
