package groot;
import java.util.*;

public class Vectorex {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		System.out.println(v.capacity());
		v.add("A");
		System.out.println(v.capacity());
		System.out.println(v);
		
	}

}
