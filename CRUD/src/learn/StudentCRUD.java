package learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentCRUD {
	
	Scanner sc=new Scanner(System.in);
	Student std;
	List<Student> s=new ArrayList<Student>();
	public void add() {
		System.out.println("Enter Student Details");
	    System.out.println("Enter Id");
	    int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Address");
		String address=sc.next();
		System.out.println("Enter marks");
		double marks=sc.nextDouble();
		std =new Student(id,name,address,marks);
		s.add(std);
	}
	public void display(){
		
		System.out.println("id\tName\tAddress\tMarks");
		for(Student x:s)
		{
			System.out.println(x);
		}
		
	}
	public void delete() {
		
		System.out.println("Enter id you want to delete");
		int id=sc.nextInt();
		for(int i=0;i<s.size();i++)
		{
		     if(s.get(i).getId()==id) {
		    	 s.remove(i);
		     }
		}
	}
	
	public void update() {
		 
		System.out.println("Enter id which one you want edit ");
		int id=sc.nextInt();
		for(int i=0;i<s.size();i++) {
					if(id==s.get(i).getId()) {
					System.out.println("Enter you want edit");
					System.out.println("1.Name\n2.Address\n3.Marks");
					int edit=sc.nextInt();
					switch(edit) {
					case 1: System.out.println("Enter Name");
					        String name=sc.next();
					        s.get(i).setName(name);
					        break;
					
					case 2: System.out.println("Enter Address");
			                String address=sc.next();
			                s.get(i).setAddress(address);
			                break;
			        
					case 3:System.out.println("Enter Marks");
	                       double marks=sc.nextDouble();
	                       s.get(i).setMarks(marks);
	                       break;           
					        
					        
				}
			}
					else {
				
				   System.out.println("Entered id not present");
			}
		}
		
			
		
		
		
	}
	

}
