public class PairInArray{
    public static void pair(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ current + ","+arr[j]+")");
                total++;
            }
            System.out.println();
        }
         System.out.println("total pair : "+ total);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        pair(arr);
        
    }
}
// compexity =O(n)
