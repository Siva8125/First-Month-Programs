package groot;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<String> Lset = new LinkedHashSet<String>();
		Lset.add("java");
		Lset.add("collections");
		Lset.add("java");
		Lset.add("set");
		Lset.add("null");
		Iterator<String> il = Lset.iterator();
		
			System.out.println(Lset);
		
	}

}
