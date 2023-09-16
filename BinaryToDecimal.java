import java.util.Scanner;

public class BinaryToDecimal {
    
    
    public static void binaryToDecimal(int n){
        int pow=0;
        int dec=0;
        int last;
        while(n>0){
            last=n%10;
            dec=dec+(last * (int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // PrimeRange(n);
        binaryToDecimal(n);


        
    }
    
}
