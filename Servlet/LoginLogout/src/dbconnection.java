import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
	
	public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection(  
			"jdbc:mysql://127.0.0.1:3306/login","root","2SD17me400@");
			 
			
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}
