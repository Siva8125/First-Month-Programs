import java.lang.ref.Reference;

public class StringImmutable {
	private static void referenceCheck(String s1, String s2) {
		if(s1==s2) {
			System.out.println("immutable");
		}else {
			System.out.println("mutable");
		}
		
	}

	public static void main(String[] args) {
		String s1 = "siva";
		String s2 = "siva";
		referenceCheck(s1,s2);
	}

	

}
