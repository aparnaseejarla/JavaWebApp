package com.test.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericSevletDemo extends GenericServlet {

	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {

		res.setContentType("text/html"); 
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>Welcome to Servlet Programming...</b>"); 
		out.print("<table>");
		out.print("<tr>");
		out.print("<th>Name</th>");
		out.print("<th>Address</th>");
		out.print("<td>Ramu</td>");
		out.print("<td>Hyd</td>");
		out.print("</table>");
		out.print("</body></html>");   
	
	}
}
