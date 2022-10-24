package org.studyeasy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("name")+"\n");
		response.getWriter().println(request.getParameter("gender")+"\n");
		
		PrintWriter out = response.getWriter();
		String[] countries = request.getParameterValues("language");

		if (countries != null)
		{
			System.out.println("heck yea!");
			 for (int i =0; i<countries.length; i++)
			 {
				 out.println("\n");
				 out.println(countries[i]);
				 out.println("\n");
			 }
		}else
		{
			 out.println("none selected");
		}
		
		response.getWriter().println(request.getParameter("country")+"\n");
	}

}
