import java.util.Arrays;
import java.util.Collections;

public class ReverseSorting {

	public static void main(String[] args) {
       Integer[] abc= {3,5,6,4,1,2};
       Arrays.sort(abc, Collections.reverseOrder());
       System.out.println("After Reverse Sorting : "+Arrays.toString(abc));
	}

}
