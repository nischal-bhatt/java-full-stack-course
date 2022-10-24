package org.studyeasy.servlet;

import java.io.IOException;
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
		String param = request.getParameter("page");
		if (param.equals("login"))
		{
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			
		}else if (param.equals("signup"))
		{
			getServletContext().getRequestDispatcher("/signup.jsp").forward(request, response);
		}else if(param.equals("about"))
		{
			getServletContext().getRequestDispatcher("/About.jsp").forward(request, response);
		}else
		{
			getServletContext().getRequestDispatcher("/notFound.jsp").forward(request, response);
		}
	}

	
	

}
