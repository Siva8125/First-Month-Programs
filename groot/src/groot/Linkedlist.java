package groot;
import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("damerla");
		l.add("siva");
		l.add("kumar");
		System.out.println(l);
		Iterator i= l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
