package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/AnsonServletProject1/HelloWorld

public class FormData extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		      
		      // Set response content type
		      response.setContentType("text/html");

		      PrintWriter out = response.getWriter();
		      String title = "Using GET Method to Read Form Data";
		      String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		         
		      out.println(docType +
		         "<html>\n" +
		            "<head><title>" + title + "</title></head>\n" +
		            "<body bgcolor = \"#f0f0f0\">\n" +
		               "<h1 align = \"center\">" + title + "</h1>\n" +
		               "<ul>\n" +
		                  "  <li><b>First Name</b>: "
		                  + request.getParameter("first_name") + "\n" +
		                  "  <li><b>Last Name</b>: "
		                  + request.getParameter("last_name") + "\n" +
		               "</ul>\n" +
		            "</body>" +
		         "</html>"

		      );
		      
		      // http://localhost:8080/AnsonServletProject1/Hello.htm
		   }
	
	// Method to handle POST method request.
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {

	      doGet(request, response);
	   }

}
