package com.projet1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Method service called!");
		
	}

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
  
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Method Get called!");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String nom = request.getParameter("nom");
		String ville = request.getParameter("ville");
		String sexe=request.getParameter("sexe");
		
		String diplome[] = request.getParameterValues("diplome");
		
		out.println("<h1>Bienvenue user: " + nom  + 
				", de la ville: "+ville+
				", sexe: "+sexe+"</h1>"); 
		 
		for(int i=0;i<diplome.length;i++)
		{
			out.println(diplome[i] + ", ");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Method Post called!");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String nom = request.getParameter("nom");
		String ville = request.getParameter("ville");
		out.println("Method POST!! </br>");
		out.println("<h1>Bienvenue user: " + nom  + ", de la ville: "+ville+"</h1>"); 
		 
		
	}

}
