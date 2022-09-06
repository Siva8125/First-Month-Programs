package groot;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.SortedSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		TreeSet<String> Tset = new TreeSet<String>();
		SortedSet<String> Sset = new TreeSet<String>();
		set.add("java");
		set.add("collections");
		set.add("java");
		set.add("set");
		set.add("null");
		Iterator<String> i = set.iterator();
		Iterator<String> it = set.iterator();
		Iterator<String> is = set.iterator();
		
		System.out.println(set);
		System.out.println(set);
		System.out.println(set);
		
		
		
			
		}
		
	}




