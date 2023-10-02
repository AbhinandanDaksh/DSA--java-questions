import java.util.*;
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n=A.length;
        int count[] = new int[n];
        int repeatedNumber=0;
        int missing=0;
        Arrays.sort(A);
        for(int i=1;i<n;i++){
            if(A[i]-A[i-1]==0){
                repeatedNumber=A[i];
            }
            if(A[i]-A[i-1]==2){
                missing=A[i-1]+1;
            }
            if(missing==0){
                missing=A[0]-1;
            
            if(A[0]==1){
                missing=A[A.length-1]+1;
            }
            }
            
        }
        int result[]={repeatedNumber,missing};
        return result;
    }
    
}
