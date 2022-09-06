package groot;
import java.util.*;

public class Stack1 {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		s1.push("siva");
		s1.push("eswar");
		s1.push("sai");
		s1.push("malli");
		s1.push("jaffa");
		s1.pop(); // by using .pop the last element or last string will be erased in output
		Iterator<String> i = s1.iterator();
		while (i.hasNext()) {
			
		
		System.out.println(i.next());
		}
		}

}
