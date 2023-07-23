public class ContinuousSubArray {
    public static void continuous(int arr[]){
for(int i=0;i<arr.length;i++){
    int start=i;
    for(int j=i;j<arr.length;j++){
        int end =j;
        for(int k=start;k<=end;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
}
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        continuous(arr);
    }
    
}
//complexity=O(n^3)
