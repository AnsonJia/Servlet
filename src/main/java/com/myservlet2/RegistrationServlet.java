package com.myservlet2;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RegistrationServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	   
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
     
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String email = request.getParameter("email");
        String phoneNum = request.getParameter("phoneNum");
        String address = request.getParameter("address");
        
        session.setAttribute("firstName", firstName);
        session.setAttribute("lastName", lastName);
        session.setAttribute("email", email);
        session.setAttribute("phoneNum", phoneNum);
        session.setAttribute("address", address);
        

        String nextPage = "<html>\r\n"
        		+ "   <body>\r\n"
        		+ "   <h1>Employment Details</h1>\r\n"
        		+ "      <form action = \"EmploymentServlet\" method = \"POST\">\r\n"
        		+ "         Job Position: <input type = \"text\" name = \"position\">\r\n"
        		+ "         <br/><br/>\r\n"
        		+ "         Department: <input type = \"text\" name = \"department\">\r\n"
        		+ "         <br/><br/>\r\n"
        		+ "         Salary: <input type = \"text\" name = \"salary\">\r\n"
        		+ "         <br/><br/>\r\n"
        		+ "         Employment Status:\r\n"
        		+ "         <input type = \"radio\" name = \"status\"  /> Full Time\r\n"
        		+ "         <input type = \"radio\" name = \"status\"  /> Part Time\r\n"
        		+ "         <input type = \"radio\" name = \"status\"  /> Contract\r\n"
        		+ "         <input type = \"radio\" name = \"status\"  /> Intern\r\n"
        		+ "         <br/><br/>\r\n"
        		+ "         <input type = \"submit\" value = \"Submit\" />\r\n"
        		+ "      </form>\r\n"
        		+ "   </body>\r\n"
        		+ "</html>";
        response.getOutputStream().print(nextPage);
        
        
        
	}
	
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {

		      doGet(request, response);
		   }
}
