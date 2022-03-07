package Collection;

import java.util.ArrayList;

public class StudentList {
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		 l.add(new StudentObject(1,"Manju",65.25));
		 
			l.add(new MobileObject("Nokia",5000));
			l.add(new StudentObject(2,"Harish",85.25));
			l.add(new MobileObject("Samung",9000));
			l.add(new MobileObject("Pepsi",3000));
			l.add(new StudentObject(3,"Abhishek",65.45));
			l.add(new MobileObject("Poco",6000));
		    l.add(new StudentObject(5,"Abhishek",56.25));
		    l.add(new StudentObject(6,"Amari",65.25));
		    
		    //Dispaly only student object
		    for(int i=0;i<l.size();i++) {
		    	Object b=(Object)l.get(i);
		    	
		    	if(b instanceof StudentObject) {
		    		//System.out.println(l.get(i));
		    	}
		    }
		    
		    //Dispaly only Mobile object
		    for(int i=0;i<l.size();i++) {
		    	Object b=(Object)l.get(i);
		    	
		    	if(b instanceof MobileObject) {
		    		//System.out.println(l.get(i));
		    	}
		    }
		
		    //Dispaly only student object
		    for(int i=0;i<l.size();i++) {
		    	Object b=(Object)l.get(i);
		    	
		    	if(b instanceof StudentObject) {
		    		if(((StudentObject) b).getMarks()>60) {
		    		System.out.println(l.get(i));
		    			
		    	}
		    }
		
	}

  }
}
