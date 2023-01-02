
public class MissingNumber {
	int MissingNumber(int array[], int n) {
        int s=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<array.length;i++){
            
                sum=sum+array[i];
            }
        
        return s-sum;
    }

}
