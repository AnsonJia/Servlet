package com.myservlet;

import java.util.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServerResponse
 */
public class ServerResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		   
		      // Set refresh, autoload time as 5 seconds
		      response.setIntHeader("Refresh", 1);
		 
		      // Set response content type
		      response.setContentType("text/html");
		 
		      // Get current time
		      Calendar calendar = new GregorianCalendar();
		      String am_pm;
		      int hour = calendar.get(Calendar.HOUR);
		      int minute = calendar.get(Calendar.MINUTE);
		      int second = calendar.get(Calendar.SECOND);
		         
		      if(calendar.get(Calendar.AM_PM) == 0)
		         am_pm = "AM";
		      else
		         am_pm = "PM";
		 
		      String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
		    
		      PrintWriter out = response.getWriter();
		      String title = "Auto Refresh Header Setting";
		      String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

		      out.println(docType +
		         "<html>\n" +
		         "<head><title>" + title + "</title></head>\n"+
		         "<body bgcolor = \"#f0f0f0\">\n" +
		         "<h1 align = \"center\">" + title + "</h1>\n" +
		         "<p>Current Time is: " + CT + "</p>\n"
		      );
		   }
		   
		   // Method to handle POST method request.
		   public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		      
		      doGet(request, response);
		   }

}
