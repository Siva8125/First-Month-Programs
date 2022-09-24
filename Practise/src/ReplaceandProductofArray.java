import java.util.Arrays;

public class ReplaceandProductofArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println("Array Elements are : "+Arrays.toString(arr));
		int product = 1;
		for(int i:arr) {
			product*=i;
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=product/arr[i];
			
		}
		System.out.println("After Replacing and Product :"+ Arrays.toString(arr));
	}

}
