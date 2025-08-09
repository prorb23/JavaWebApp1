package com.ronit.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ronit.dao.UserDAO;
import com.ronit.model.User;

public class RegisterServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		User user = new User(name,email,password);
		UserDAO dao = new UserDAO();
		boolean result = dao.registerUser(user);
		
		if(result) {
			res.sendRedirect("login.jsp");
		}
		else {
			res.sendRedirect("error.jsp");
		}
	}
}
