package groot;

public class Implicit {

	public static void main(String[] args) {
		long l = 65;
		float f = (float)l;
		int i = (int)f;
		char ch = (char)i;
		System.out.println(l+"   "+f+"   "+i+"   "+ch);
		
	}

}
