package com.test.servlet.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomeServletInterface  implements Servlet{

	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{  
		System.out.println("Serivice methood called each and very request ******************");

		res.setContentType("text/html"); 
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>Welcome to Servlet Programming...</b>");  
		out.print("</body></html>");   
	}

	
	public void destroy() {
		System.out.println("Destory method called only once ******************");
		// TODO Auto-generated method stub
		
	}


	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Servlet is initilized it will call only once******************");

		// TODO Auto-generated method stub
		
	}
}