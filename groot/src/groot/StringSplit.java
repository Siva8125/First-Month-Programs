package groot;

public class StringSplit {

	public static void main(String[] args) {
		String s1="siva is a good boy";
		String[]words=s1.split("\\s");
		for(String w:words) {
			System.out.println(w);
		}

	}

}
