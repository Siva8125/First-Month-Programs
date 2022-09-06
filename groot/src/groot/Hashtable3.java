package groot;

import java.util.Hashtable;

public class Hashtable3 {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "c");
		h.put(new Temp(15), "D");
		h.put(new Temp(23),"E");
		h.put(new Temp(16),"F");
		System.out.println(h);
	}
}

		class Temp{
			int i;
			Temp(int i)
			{
				this.i=i;
			}
			public Temp() {
				// TODO Auto-generated constructor stub
			}
			public int hashcode()
			{
				return i%9;
			}
			public String toString()
			{
				return i+" ";
			}
			}

	
