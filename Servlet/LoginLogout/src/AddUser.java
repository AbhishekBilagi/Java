import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddUser extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		req.getRequestDispatcher("link.html").include(req, resp);
		String name=req.getParameter("name");
		 String password=req.getParameter("password");
		 if(name=="" && password=="") {
			 out.print("<h1>Plaese Enter UserName and Password.....</h1>");
		 }
		 else {
		 try {
			 Connection con=dbconnection.getCon();
				PreparedStatement stmt=con.prepareStatement("insert into usercredential values(?,?)");
				stmt.setString(1, name);
				stmt.setString(2,password);
				int rs=stmt.executeUpdate();
				out.print("<h1>User Sucessfully Added.....</h1>");
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		  }
		 }
	}

}
