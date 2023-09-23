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
// compexity =O(n^2)

// (2,4)(2,5)(2,6)(2,7)(2,8)(2,9)
// (4,5)(4,6)(4,7)(4,8)(4,9)
// (5,6)(5,7)(5,8)(5,9)
// (6,7)(6,8)(6,9)
// (7,8)(7,9)
// (8,9)

// Total pair : 21
