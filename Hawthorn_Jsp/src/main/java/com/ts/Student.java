package com.ts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Student")
public class Student extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("data"/*key*/, "Hello how r u"/*value or data*/);//this is write to access data by calling key
		
		req.getRequestDispatcher("index.jsp").forward(req/*request*/, resp/*response*/);//here we are forwarding data that write in key value to the index.jsp 
	}

}
