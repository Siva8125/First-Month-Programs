package groot;
import java.util.*;

import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> h = new Hashtable<Integer,String>();
		h.put(5, "A");
		h.put(2, "B");
		h.put(6, "C");
		h.put(15, "D");
		h.put(23,"E");
		h.put(16,"E");
		System.out.println(h);
		class Temp{
			int i;
			Temp(int i)
			{
				this.i=i;
			}
			public int hashcode()
			{
				return i;
			}
			public String toString()
			{
				return i+" ";
			}
			}
		}
		
		
		
		
		
	}


