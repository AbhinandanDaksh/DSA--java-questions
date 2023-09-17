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
    public static void DecimalToBinary(int n) {
        int bin=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            bin=bin+(rem*(int)(Math.pow(10, pow)));
            pow++;
            n=n/2;
        }
        System.out.println(bin);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out,println("Enter binary numbers");
        int n=sc.nextInt();
        binaryToDecimal(n);
        System.out,println("Enter Decimal numbers");
        int m=sc.nextInt();
        DecimalToBinary(m);


        
    }
    
}
