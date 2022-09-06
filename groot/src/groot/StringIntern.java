package groot;

public class StringIntern {

	public static void main(String[] args) {
		String s=new String("siva");
		String s2=s.intern();
		System.out.println(s2);
		

	}

}
