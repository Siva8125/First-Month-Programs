
// Java Program to Add Characters to a String
// At the End



// Main class
public class AddCharsInString {

	// Main driver method
	public static void main(String args[])
	{

		/*// Input character and string
		char a = 's';
		String str = "GeeksforGeek";

		// Inserting at the end
		String str2 = str + a;

		// Print and display the above string
		System.out.println(str2);
	}*/
	// Input character and string
    char a = 'G';
    String str = "eeksforGeeks";

    // Inserting at the beginning
    String str2 = a + str;

    // Print and display the above string
    System.out.println(str2);
}
}
//Java Program to Add Characters to a String
//Using StringBuffer class insert() method

//Main class
//AddCharacterToStringAnyPosition
/*public class AddCharsInString {

	// Method 1
	// To add character to string
	public static String addCharToString(String str, char c,
										int pos)
	{

		// Creating an object of StringBuffer class
		StringBuffer stringBuffer = new StringBuffer(str);

		// insert() method where position of character to be
		// inserted is specified as in arguments
		stringBuffer.insert(pos, c);

		// Return the updated string
		// Concatenated string
		return stringBuffer.toString();
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		// Input string and character
		String blogName = "GeeksforGeeks";
		char two = 'f';

		// Calling the method 1 to
		// add character to a string

		// Custom string, character and position passed
		String cblogName
			= addCharToString(blogName, two, 5);

		// Print and display th above string
		System.out.println(cblogName);
	}
}*/
//Java Program to Add Characters to a String
//Using substring() method

//Main class
//AddCharacterToStringAnyPosition
/*public class AddCharsInString {

	// Method 1
	// To add character to a string
	public static String
	addCharToStringUsingSubString(String str, char c,
								int pos)
	{
		return str.substring(0, pos) + c
			+ str.substring(pos);
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{
		// Custom input character and string
		String blogName = "GeeksforGeeks";
		char two = 'f';

		// Calling the Method 1 to
		// To add character to a string

		// Custom arguments
		String cblogName = addCharToStringUsingSubString(
			blogName, two, 5);

		// Print and display the above string on console
		System.out.println(cblogName);
	}
}*/



