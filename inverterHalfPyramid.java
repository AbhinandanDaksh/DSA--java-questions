import java.util.Scanner;

public class InverterHalfPyramid {
    public static void inverterHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        // int col=sc.nextInt();
        // printPattern(row,col);
        inverterHalfPyramid(row);

    }
}

// 12345
// 1234
// 123
// 12
// 1
