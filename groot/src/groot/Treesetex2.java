package groot;
import java.util.TreeSet;

public class Treesetex2 {

	public static void main(String[] args) {
		TreeSet t =  new TreeSet();
		t.add("B");
		t.add("A");
		t.add("Z");
		t.add(null);
		System.out.println("B".compareTo("A"));
		System.out.println("B".compareTo("Z"));
		System.out.println("A".compareTo("A"));
		System.out.println("B".compareTo(null));
		
		
		
		
	}

}
