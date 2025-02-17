package com.gopi;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Multinum  extends HttpServlet {
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		 Cookie cok[] = req.getCookies();
		 
		String Name  = "";
		String Password = "";
		
		 
		 for(Cookie a : cok)
		 {
			 if(a.getName().equals("nam")) {
				  Name = String.valueOf(a.getValue());
				  
			 }
			 
			 
			 if(a.getName().equals("pass"))
			 {
				 Password = String.valueOf(a.getValue());
			 }
		 }
		 
		 String result = "";
		 
		 if(Name.equals("gopi") && Password.equals("123"))
		 {
			 result= "Successfully Login";
		 }
		 else
		 {
			 result = "Failed to login";
		 }
		
		
		res.setContentType("text/html");
		PrintWriter out =  res.getWriter();
		out.println("<h1>Square :" +result+ "</h1>");
		
	}

}
