//package SingIn;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.database.;
public class LoginServlet extends HttpServlet {
	String name;
	String password;
	boolean result;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		 name=request.getParameter("name");
		 password=request.getParameter("password");
		 if(name=="" && password=="" ) {
			 request.getRequestDispatcher("link.html").include(request, response);
			 out.print("<h1>Please Enter UserName and Password</h1>");
		 }
		 else {
		        result=LoginServlet.validateUser(name,password);
		 }
		 try {
			 if(name!="" && password!="" ) {
			   if(result) {
				  request.getRequestDispatcher("logout.html").include(request, response);
				 out.print("<h1>Welcome "+name+"</h1>");
				 
			   }
			 
			 else {
				 request.getRequestDispatcher("logout.html").include(request, response);
				 out.print("<h1>In Valid UserName and Password....</h1>");
			 }
		    }
		 }
		 catch(Exception ex){
			 
			 System.out.println(ex.getMessage());
			 
		 }
		
		/*if(password.equals("admin123")){
		out.print("Welcome, "+name);
		HttpSession session=request.getSession();
		session.setAttribute("name",name);
		}
		else{
			out.print("Sorry, username or password error!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();*/
	}
	public static boolean validateUser(String name,String password) {
		boolean found=false;
		try {
		
		Connection con=dbconnection.getCon();
		PreparedStatement stmt=con.prepareStatement("select * from usercredential where username=? and password=?");
		stmt.setString(1, name);
		stmt.setString(2,password);
		ResultSet rs=stmt.executeQuery();
		if(rs.next()==false) {
			found=false;
		}
		else {
			found =true;
		}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return found;
		
	}

}


	
	

