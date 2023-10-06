class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        int count=0;
        for(int i=l;i<r+1;i++){
            count++;
            if(count==k){
                return arr[i];
            }
        }
        return -1;
       
    } 
}
