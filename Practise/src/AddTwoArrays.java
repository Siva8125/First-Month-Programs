import java.util.Arrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		/*int[] array1= {1,2,3};
		int[] array2= {4,5,6};
		int len1=array1.length;
		int len2=array2.length;
		int[] result = new int[len1+len2];
		System.arraycopy(array1,0,result,0,len1);
		System.arraycopy(array2,0,result,len1,len2);
		System.out.println(Arrays.toString(result));
	}*/
		int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int position = 0;
        for (int element : array1) {
            result[position] = element;
            position++;
        }

        for (int element : array2) {
            result[position] = element;
            position++;
        }

        System.out.println(Arrays.toString(result));
    }

}
