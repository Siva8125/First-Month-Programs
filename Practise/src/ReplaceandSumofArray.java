import java.util.Arrays;

public class ReplaceandSumofArray {

	public static void main(String[] args) {
		int[] adds= {1,2,3,4};
		System.out.println("Elements are : "+Arrays.toString(adds));
		int sum =0;
		for(int i:adds) {
			sum+=i;
		}
		for(int i=0;i<adds.length;i++) {
			adds[i]=sum-adds[i];
		}
		System.out.println("After Replacing and Adding : "+Arrays.toString(adds));
	}

}
