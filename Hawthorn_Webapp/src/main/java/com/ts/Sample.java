package com.ts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/trial")
public class Sample extends HttpServlet {
	public void Hello() {
		System.out.println("hello World");
	}
     //override the doget method from httpservlet by ctr+ click on it
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hello World");
	}

}
