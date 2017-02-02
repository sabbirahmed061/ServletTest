package com.ibm.cognos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		System.out.println("hello world from XMLServlet in the console");
		PrintWriter writer=response.getWriter();
		writer.println("Hello from XMLServlet and from the Get method");
		
		String UserName=request.getParameter("userName");
		writer.println("<br/>");
		writer.println("<br/>hello "+UserName);
		
		String UserId=request.getParameter("userId");
		writer.println("<br/>userId: "+UserId);
		
		writer.println("<br/>Init paramater has default name: " +getServletConfig().getInitParameter("defaultName"));
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello world from XMLServlet in the console");
		PrintWriter writer=response.getWriter();
		writer.println("Hello from XMLServlet and from POST method");
		
		String UserName=request.getParameter("userName");
		writer.println("<br/>");
		writer.println("<br/>hello from POST method "+UserName);
		
		String fullName=request.getParameter("fullName");
		writer.println("<br/>full name:"+fullName);
		
		String prof=request.getParameter("prof");
		writer.println("<br/>prof:"+prof);
		
//		String location=request.getParameter("location");
//		writer.println("<br/>location:"+location);
		
		String[] location=request.getParameterValues("location");
		writer.println("<br/> Number of places"+location.length);
		for(int i=0;i<location.length;i++){
			writer.println("<br/>place:"+location[i]);
		}
		
		String UserId=request.getParameter("userId");
		writer.println("<br/>userId: "+UserId);
		writer.println("<br/>This is printed from doPost of the servlet");
		
		
		
		
	}
}
