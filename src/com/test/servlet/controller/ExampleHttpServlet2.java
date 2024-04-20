package com.test.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleHttpServlet2 extends HttpServlet {

	public void doGet (HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		// set content-type header before accessing the Writer
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
         
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<table>");
		pw.print("<tr>");
		pw.print("<th>No</th>");
		pw.print("<th>Name</th>");
		pw.print("</tr>");
		pw.print("<tr>");
		pw.print("<td>1</td>");
		pw.print("<td>Raju</td>");
		pw.print("</tr>");
		pw.print("</table>");
		pw.print("<body>");
		pw.print("<html>");
		pw.close();
	}

	public void doPost (HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{

		// set content-type header before accessing the Writer
		resp.setContentType("text/html");
		//Get the client or request parameters 
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String emailId = req.getParameter("emailId");
		String password = req.getParameter("password");

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1>Employee Resistration Form Data</h1>");
		printWriter.print("<p> firstName :: " + firstName + "</p>");
		printWriter.print("<p> lastName :: " + lastName + "</p>");
		printWriter.print("<p> firstName :: " + emailId + "</p>");
		printWriter.print("<p> firstName :: " + password + "</p>");
		printWriter.print("</body>");
		printWriter.print("</html>");
		printWriter.close();

		System.out.println("firstName :: " + firstName);
		System.out.println("lastName :: " + lastName);
		System.out.println("emailId :: " + emailId);
		System.out.println("password :: " + password);
	}
}