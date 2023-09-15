import java.util.*;
public class IsPrime {
    
    
    public static boolean isPrime(int n){
        // boolean prime=true;
        if(n==1 && n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }  
        }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
       
        if(isPrime(n)){
            System.out.println("is Prime");
        }
        else{
            System.out.println("is not prime");
        }
    }
}
