package groot;

import java.util.Arrays;
import java.util.Collections;

public class StringArrayDescending {

	public static void main(String[] args) {
		String[] countries = {"Wood apple", "Blackberry", "Date", "Naseberry", "Tamarind","Apricot"};
		Arrays.sort(countries,Collections.reverseOrder());
		System.out.println(Arrays.toString(countries));
		
	}

}
