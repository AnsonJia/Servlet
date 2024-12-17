package com.myservlet2;

import java.io.FileWriter;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmploymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String position = request.getParameter("position");
    	String department = request.getParameter("department");
    	String salary = request.getParameter("salary");
    	String status = request.getParameter("status");
    	
    	HttpSession session = request.getSession();
    	String firstName = (String) session.getAttribute("firstName");
    	String lastName = (String) session.getAttribute("lastName");
    	String email = (String) session.getAttribute("email");
    	String phoneNum = (String) session.getAttribute("phoneNum");
    	String address = (String) session.getAttribute("address");
   
		

    	String data = "First Name: " + firstName + "\n" +
                  	"Last Name: " + lastName + "\n" + 
                  	"Email: " + email + "\n" +
                  	"Phone Number: " + phoneNum + "\n" +
                  	"Address: " + address + "\n" +
                  	"Company Name: " + position + "\n" +
                  	"Job Title: " + department + "\n" +
                  	"Employment Status: " + status + "\n" +
                  	"Salary: " + salary + "\n\n";
    	
    	
    	
    	String filePath = "C:/Users/anson/eclipse-workspace/AnsonServletProject1/src/main/webapp/user_data.txt";
    	FileWriter fileWriter = new FileWriter(filePath, true);
    	fileWriter.write(data);
    	fileWriter.close();
    	response.getOutputStream().print("succeed!");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
