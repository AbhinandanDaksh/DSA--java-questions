public class PatternRe01{
    public static void Star(int n){
        if(n==0){
            return ;
        }System.out.print("*");
        Star(n-1);
    }
    public static void Pattern(int n,int i) {
        if(n==0){
            return;
        }Star(i);
        System.out.println();
        Pattern(n-1, i+1);
        
    }
    public static void main(String[] args) {
    Pattern(5, 1);
        
    }
}