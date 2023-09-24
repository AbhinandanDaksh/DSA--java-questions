public class Kadanes {
    
    public static void kadanes(int n[]){
        int currSum=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            currSum+=n[i];
            if(currSum<0){
                currSum=0;
            }
            ms=Math.max(currSum,ms);
            
        }
        System.out.println("our total sub array : "+ms);
    }
    public static void main(String[] args) {
        int n[]={2,3,4,5,6};
        kadanes(n);
        
    }
    
}
