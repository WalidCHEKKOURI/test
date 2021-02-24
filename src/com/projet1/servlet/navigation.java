package com.projet1.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class navigation
 */
@WebServlet("/navigation")
public class navigation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public navigation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nom = request.getParameter("nom");
		String msg="";
		if(nom!="" && nom!=null)
		{
			
		msg="Bienvenu Mr.User";
		request.setAttribute("message", msg);
		this.getServletContext().getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
		}else
		{
			msg="Champ est vide";
			request.setAttribute("message", msg);
			this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		//response.sendRedirect("https://www.google.com/");
		
		}
		
		
	}

}
