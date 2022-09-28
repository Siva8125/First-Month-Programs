
public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr = {1,5,6,7,2,8,9,5,3,4,5,2,6,7,9,2,8};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("The Duplicate Elements are : "+arr[j]);
				}
			}
		}
		
	}

}
