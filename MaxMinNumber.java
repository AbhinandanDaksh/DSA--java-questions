public class Day20 {
    public static void maxMinNumber(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr[]={1,9,7,5,2};
        maxMinNumber(arr);
    }
    
}
