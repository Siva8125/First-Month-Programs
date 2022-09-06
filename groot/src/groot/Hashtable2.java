package groot;

import java.util.Hashtable;

public class Hashtable2 {

	public static void main(String[] args) {
		Hashtable<Integer,String> h = new Hashtable<Integer,String>(25);
		h.put(5, "A");
		h.put(2, "B");
		h.put(6, "c");
		h.put(15, "D");
		h.put(23,"E");
		h.put(16,"F");
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
