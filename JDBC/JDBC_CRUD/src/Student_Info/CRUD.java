package Student_Info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CRUD {
	
	public static void add() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of student to add");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the Student Details");
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.nextLine();
			System.out.println("Enter Address");
			String address=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter City");
			String city=sc.nextLine();
			System.out.println("Enter PanNumber");
			String pan=sc.nextLine();
			
			Student s=new Student(id,name,address,city,pan);
			try {
			Connection con=Studentdb.db();
			PreparedStatement stmt=con.prepareStatement("insert into studentdb values(?,?,?,?,?)");
			stmt.setInt(1, s.getId());
			stmt.setString(2, s.getName());
			stmt.setString(3, s.getAddress());
			stmt.setString(4, s.getCity());
			stmt.setString(5, s.getPanno());
			int result=stmt.executeUpdate();
			System.out.println("Student added sucessfully");
			
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	public static void view()
	{
		System.out.println("id\tName\tAddress\tCity\tPanNumber");
		System.out.println(".........................................................");
		try {
		 Connection con=Studentdb.db();
		 Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from studentdb");
		 while(rs.next()) {
			 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
		 }
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	    public static void update() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id you want edit");
		int id=sc.nextInt();
		
		System.out.println("Enter Address");
		String address=sc.next();
		try {
	    	Connection con=Studentdb.db();
			 
			 PreparedStatement stmt=con.prepareStatement("update studentdb set address=? where studentid=?");
			 stmt.setString(1, address);
			 stmt.setInt(2, id);
			 int result=stmt.executeUpdate();
			 System.out.println("Updated Sucessfully");
				 
			 }
	    catch(Exception e) {
			System.out.println(e.getMessage());
		}
	    	
	    	
	    }
	    
	    public static void delete() {
	    	Scanner sc=new Scanner(System.in);
			System.out.println("Enter id you want Delete");
			int id=sc.nextInt();
			 try {
			    	Connection con=Studentdb.db();
					 
					 PreparedStatement stmt=con.prepareStatement("delete from studentdb where studentid=?");
			          stmt.setInt(1, id);
					 int result=stmt.executeUpdate();
					 System.out.println("Deleted Sucessfully");
						 
					 }
			    catch(Exception e) {
					System.out.println(e.getMessage());
				}
	    	
	    }
		
		
	}
	



