public class BubbleSort {
    public static void bubble(int n[]){
        for(int i=0;i<n.length-1;i++){
            for(int j=0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]){
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                    
                }
            }
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
        // System.out.println(bubble(n););
        bubble(n);
        printn(n);
        
    }
    
}
