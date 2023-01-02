import java.util.ArrayList;

public class SubarrayAdding {
	public static void main(String args[]) {
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here

        int sum = 0, startIndex = 0, lastIndex = 0;
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
            if(arr.length > 1 && s == 0){
            ans.add(-1);
            return ans;
        }
        
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            lastIndex = i;
            if(sum >= s)
            break;
        }
        
        if(sum == s){
            ans.add(startIndex+1);
            ans.add(lastIndex+1);
            return ans;
        }
        
        for(int i = 0; i < n; i++){
            if(sum > s){
                sum = sum - arr[i];
                //System.out.println(sum);
            }
            else if(sum < s){
                if(lastIndex <  n - 1){
                    lastIndex++;
                    sum = sum + arr[lastIndex];
                    i--;
                }
            }
            else{
            ans.add(i+1);
            ans.add(lastIndex+1);
            return ans;
            }
            
        }
        
        ans.add(-1);
        return ans;
       

        
    }
	

}
