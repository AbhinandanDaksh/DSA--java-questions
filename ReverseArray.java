public class ReverseArray {
    public static void ArrayReverse(int arr[]){
        int temp;
        int first=0;
        int last=arr.length-1;
        while(first<last){
            temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] ={4,3,2,5,6};
        ArrayReverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
