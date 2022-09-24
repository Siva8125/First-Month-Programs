
public class SmallestArray {

	public static void main(String[] args) {
		double[] numarray= {55.22,99.11,77.88,22.66,35.89,91.17,76.28};
		double smallest = numarray[0];
		for(double num:numarray) {
			if(smallest>num) {
				smallest = num;
			}
		}
		System.out.printf("Smallest Number is : %.2f",smallest);
	}

}
