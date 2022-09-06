package groot;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("siva");
		list.add("kumar");
		
		Iterator i =  list.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
				
		

	}

}
