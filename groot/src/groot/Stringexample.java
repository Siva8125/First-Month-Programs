package groot;

public class Stringexample {
	
	public static void main(String[] args) {
		String s="java";
		char ch[]= {'s','t','r','i','n','g'};// ch[] is an array
		String s2=new String(ch); // conversion of array to string is happened & stored in heap memory
		String s3=new String("example");
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		// TODO Auto-generated method stub

	}

}
