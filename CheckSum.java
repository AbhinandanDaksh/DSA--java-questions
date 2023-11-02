import java.util.*;

public class Day23 {

    public static boolean checksum(int arr[],int k){
        Arrays.sort(arr);
        int n=arr.length;
        int start=0;
        int end=n-1;
        for(int i=0;i<n;i++){
            if(k==arr[start]+arr[end]){
                return true;

            }
            if(k<arr[i]+arr[n-i-1]){
                end--;
            }
            else{
                start++;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={11, 15, 26, 38, 9, 10};
        int target=55;
        System.out.println(checksum(arr,target));
    }
    
}
//
