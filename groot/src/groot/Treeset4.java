package groot;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset4 {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  
		set.add("siva");  
		set.add("anu");  
		set.add("lav");  
		set.add("siva");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
