
public class RemoveSpecialChars {

	public static void main(String[] args) {
		String s = "1 am g00D k!d";
		int special = 0;
		
		
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				special++;
			}
		}
		if(special==0) {
			System.out.println("No Special Characters");
		}else {
			System.out.println("Total Special Characters are "+special);
		}
		
		}
	

}


