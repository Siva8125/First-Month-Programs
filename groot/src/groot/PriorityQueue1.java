package groot;
import java.util.*;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue();
		
		p.add("siva");
		p.add("eswar");
		p.add("sai");
		p.add("malli");
		p.add("jaffa");
		System.out.println(p.element());
		System.out.println(p.peek());
		Iterator i2 = p.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
