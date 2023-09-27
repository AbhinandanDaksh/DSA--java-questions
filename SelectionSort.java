public class SelectionSort {

    
   
    public static void selectionSort(int n[]){
        for(int i=0;i<n.length;i++){
            int minPos=i;
            for(int j=i+1;j<n.length;j++){
                if(n[minPos]>n[j]){
                    minPos=j;
                }

            }
            int temp=n[minPos];
            n[minPos]=n[i];
            n[i]=temp;
        }
    }
     public static void printn(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n[]={7,1,5,3,6,4};
        selectionSort(n);
        printn(n);
        
    }
    
}
