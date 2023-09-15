import java.util.Scanner;

public class Day12 {
    public static boolean IsPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    public static void PrimeRange(int m){
        for(int i=2;i<m;i++){
            if(IsPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrimeRange(n);

        
    }
    
}
