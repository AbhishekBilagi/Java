package learn;

import java.util.Scanner;

public class StudentMain {
 public static void main(String[] args) {
	 StudentCRUD crud=new StudentCRUD();
	 Scanner sc=new Scanner(System.in);
	 while(true)
	{
	 
	 System.out.println("1.add\n2.read\n3.remove\n4.update");
	 System.out.println("Enter your choice");
	 int n=sc.nextInt();
	 switch(n) {
	 
	 case 1 : crud.add();
	         break;
	 case 2: crud.display();
	         break;
	 case 3: crud.delete();
	         break;
	 case 4: crud.update();
	         break;
	         
	         
	  }
	}
	 
 }
}
