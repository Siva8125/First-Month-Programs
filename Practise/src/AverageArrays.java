
public class AverageArrays {

	public static void main(String[] args) {
		double[] numarray = {55.22,99.11,77.88,22.66,35.89,91.17,76.28};
		double sum=0.0;
		for(double num:numarray) {
			sum+=num;
			
		}
		double average = sum/numarray.length;
		System.out.printf("The average is: %.2f",average);
	}

}
