package Student_Info;

import java.sql.Connection;
import java.sql.DriverManager;

public class Studentdb {
      
	public static Connection db(){
		Connection con=null;
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection(  
				"jdbc:mysql://127.0.0.1:3306/student_info","root","2SD17me400@");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		 
		 return con;
		
	}
	

}
