import java.util.Arrays;
import java.util.Random;

public class ShuffleArrayElements {

	public static void main(String[] args) {
		int[] shuf= {1,2,3,4,5,6,7,8,9};
		System.out.println("Before Shuffeling : "+ Arrays.toString(shuf));
		shuffle(shuf);
	}

	private static void shuffle(int[] shuf) {
		Random rand = new Random();
        int randomVariable, temp;
        for(int i=shuf.length-1; i>=1;i-- )
        {
            // Finds a random number between 0 and the current location of array
            randomVariable= rand.nextInt(i+1);
            // Swaps the elements
            temp = shuf[i];
            shuf[i] = shuf[randomVariable];
            shuf[randomVariable] = temp;		
	}
        System.out.println("AfterShuffeling :"+Arrays.toString(shuf));

}
}
