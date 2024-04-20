package com.test.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class VoterServlet extends GenericServlet
{
	public void service(ServletRequest request,ServletResponse response)
			throws ServletException,IOException
			{
		String str=request.getParameter("age");
		int x=Integer.parseInt(str);
		PrintWriter pw=response.getWriter();
		if(x>=18)
			pw.println("<h1>You are valid voter!!!</h1>");
		else
			pw.println("<h2>You are invalid voter!!!</h2>");
		pw.close();
			}
}
