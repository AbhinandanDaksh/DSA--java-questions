//
public class BinarySearch{
    public static int binarySearch(int arr[],int key){
        int start =0,end=arr.length;
        // int mid=(start+end)/2;
        while (start<=end) {
            int mid=(start+end)/2;

            if(arr[mid]>key){
                end=mid-1;
            }
             else if(arr[mid]==key){
                return mid;
                // break;
            }
            
            else{
                start=mid+1;
            }
        }
        // mid=(start+end)/2;
        // System.out.println("error");
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,7,89};
        int key = 6;
        System.out.println(binarySearch(arr, key));
    }
}
