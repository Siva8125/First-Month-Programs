
public class Frequencychar {

	public static void main(String[] args) {
		String s = "this is a strange world";
		char ch = 'a';
		int freq = 0;
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				freq++;
			}
			
		}
		System.out.println("frequency of "+ch+" is : "+freq);
	}

}
