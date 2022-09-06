package groot;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;


public class Hashmap1 {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(700,"chiru");
		m.put(800,"balayya");
		m.put(200,"venky");
		m.put(500,"nag");
		System.out.println(m);
		System.out.println(m.put(1000,"chiru"));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator i = s1.iterator();
		while(i.hasNext()) {
			Map.Entry m1 = (Map.Entry)i.next();
					System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals("nag"))
			{
				m1.setValue(10000);
				
			}
			
		}
		
		
	}

}
