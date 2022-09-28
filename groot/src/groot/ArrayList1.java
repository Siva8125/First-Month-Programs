package groot;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  //accessing the element    
		  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element  
		  al.set(1,"Dates");  
		  //Traversing list  
		  for(String fruit:al)    
		    System.out.println(fruit); 
		  Collections.sort(al);
		  for(String fruits:al) {
			  System.out.println("after sorting : "+fruits);
			  
		  }
		  for(int i=0;i<al.size();i++) {
			  System.out.println(al.get(i));
		  }
	}

}
