import java.util.*;

public class  PalindromicArray {

    
    public static int sum2(int[] arr ){
            int count=0;
            int n=arr.length;
            int i=0;
            int j=n-1;
            
            // for(int i=0,j=n-1;i<=j;)
            while(i<j){
                if(arr[i]==arr[j]){
                i++;
                j--;
                }
                else if(arr[i]>arr[j]){
                    j--;
                    arr[j]=arr[j]+arr[j+1];
                    count++;
                }
                else{
                    i++;
                    arr[i]+=arr[i-1];
                    count++;
                }

            }
            return count;
    } 
    public static void main(String[] args) {
        int arr[]={15,4,5,3,2,5,4,15};
        System.out.println(sum2(arr));
    }
    
}
