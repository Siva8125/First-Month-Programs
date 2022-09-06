package groot;

import java.util.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Linkedhashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> m = new LinkedHashMap<Integer,String>();
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
		System.out.println(m);
		
	}

}
