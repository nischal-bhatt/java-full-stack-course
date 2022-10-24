package org.studyeasy.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MemberAreaController")
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MemberAreaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String action = request.getParameter("action");
	   switch(action)
	   {
	   case "destroy":
		   request.getSession().invalidate();
		  // Cookie[] cookies = request.getCookies();
		   
		  // for(Cookie cookie: cookies)
		   //{
			//   if (cookie.getName().equals("username"))
			 //  {
			//	   cookie.setValue(null);
			//	   cookie.setMaxAge(0);
			//	   response.addCookie(cookie);
			 //  }
		  // }
		   
		   response.sendRedirect(request.getContextPath() +"/SiteController?action=login");
		   break;
	   case "memberArea":
		   request.getRequestDispatcher("memberArea.jsp").forward(request, response);
	       break;
	   case "memberOnly":
		   request.getRequestDispatcher("membersOnly.jsp").forward(request, response);
	       break;
	   default:
			   break;
	   }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
