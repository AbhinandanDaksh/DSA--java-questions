public class LargestNumber{
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={65,4,333,6,8,8,9};
        System.out.println("largest value is : "+ largest(arr));

    }
}
// / omplexity = O(n)
