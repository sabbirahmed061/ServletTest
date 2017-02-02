package com.ibm.cognos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "This is a servlet", urlPatterns = { "/AdvancedSimpleServletPath" },
			initParams={@WebInitParam(name="defaultUser", value="John Doe")}
		)
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello world from SimpleServlet in the console");
		PrintWriter writer=response.getWriter();
		writer.println();
		writer.println("Hello from SimpleServlet");
		
		String userName=request.getParameter("name");
		writer.println("<br/>"+userName);
		HttpSession session=request.getSession();
		ServletContext context=request.getServletContext();
		
		if(userName!="" && userName!=null){
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		
		writer.println();
		writer.println("<br/>request parameter has username: "+userName);
		writer.println();
		writer.println("<br/>session paramater has username: "+session.getAttribute("savedUserName"));
		writer.println("<br/>context paramater has username: "+context.getAttribute("savedUserName"));
		
		writer.println("<br/>Init paramater has default username : " +getServletConfig().getInitParameter("defaultUser"));
	}

}
