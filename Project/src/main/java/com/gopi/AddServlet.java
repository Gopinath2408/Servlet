package com.gopi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Get parameters from request
        String name = String.valueOf(req.getParameter("nam"));
        String password =String.valueOf(req.getParameter("pass"));
       
       // To create a Session Cookies        
        Cookie cook1 = new Cookie("nam",name);
        Cookie cook2 = new Cookie("pass",password);
        
        res.addCookie(cook1);
        res.addCookie(cook2);
        
        //To Send the Data to the Another Servlet using SendRedirect and passing the data using url;
          res.sendRedirect("sq");
     
    }
}



//This is a code to get the data from html form and Send the client

/* public class AddServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Get parameters from request
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        // Calculate result
        int result = num1 + num2;

       // System.out.println("The Result is :"+ result);	
        
        
        Send response to client
       PrintWriter out = res.getWriter();
       out.println("The result is :" + result);
    }
}*/




//This is a code to send the data to another Servlet using RequestDispatcher:

/* public class AddServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Get parameters from request
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        // Calculate result
        int result = num1 + num2;

       // System.out.println("The Result is :"+ result);	
        
        
        //To Send the Data to the Another Servlet
        
             req.setAttribute("k", result*result);
                
             RequestDispatcher rd = req.getRequestDispatcher("sq");
             rd.forward(req, res);
             
        
//        Send response to client
//       PrintWriter out = res.getWriter();
//       out.println("The result is :" + result);
    }
}  */



//This is a code to send the data to another Servlet using SendRedirect and Session Management:

/* public class AddServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Get parameters from request
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        // Calculate result
        int result = num1 + num2;

       // System.out.println("The Result is :"+ result);	
        
        
        
        //To Send the Data to the Another Servlet using SendRedirect and passing the data using url;
          res.sendRedirect("sq?result="+result);
             
        

    }
}*/



//Thi
//public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//    // Get parameters from request
//    int num1 = Integer.parseInt(req.getParameter("num1"));
//    int num2 = Integer.parseInt(req.getParameter("num2"));
//
//    // Calculate result
//    int result = num1 + num2;
//
//   // To create a Session Cookies
//    
//    HttpSession session = req.getSession();
//    
//    session.setAttribute("dt" ,result);
//    
//    
//    //To Send the Data to the Another Servlet using SendRedirect and passing the data using url;
//      res.sendRedirect("sq?result="+result);
//         
//    
//
//}
