package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(12);
		l.add(13);
		l.add("hello");
		l.add("hi");
		l.add("demo");
		l.add(88);
		l.add(75);
		
		//print only integer
		for(int i=0;i<l.size();i++) {
			Object a=(Object) l.get(i);
			
			if(a instanceof Integer)
			{
				//System.out.println(a);
			}
		}
		
		for(int i=0;i<l.size();i++) {
			Object x=(Object) l.get(i);
			if(x instanceof Integer) {
				Integer n=(Integer) x;
				if(n%2==0) {
					//System.out.println(n);
				}
			}
		}
		
		for(int i=0;i<l.size();i++) {
			Object s=(Object)l.get(i);
			if(s instanceof String) {
				if(((String) s).startsWith("h")) {
					//System.out.println(s);
				}
			}
				
		}
		l.removeLast();
		for(int i=0;i<l.size();i++) {
			
			
			System.out.println(l.get(i));
		}
       	
        
	}

}
