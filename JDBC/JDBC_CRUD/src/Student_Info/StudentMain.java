package Student_Info;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.Add\n2.Read\n3.Update\n4.Delete\n5.Exist");
		System.out.println("Enter Your Choice");
		int n=sc.nextInt();
		switch(n) {
		
		case 1: CRUD.add();
		        break;
		case 2:CRUD.view();
		        break;
		case 3: CRUD.update();
		        break;
		case 4:CRUD.delete();
		        break;
		case 5: System.exit(0);;
		 }
		}
		
		
		
	}

}
