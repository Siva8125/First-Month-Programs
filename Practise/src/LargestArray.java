
public class LargestArray {

	public static void main(String[] args) {
		double[] numarray= {55.22,99.11,77.88,22.66,35.89,91.17,76.28};
		double largest = numarray[0];
		for(double num:numarray) {
			if(largest<num) {
				largest = num;
			}
		}
		System.out.printf("Largest Number is : %.2f",largest);
		
	}

}
