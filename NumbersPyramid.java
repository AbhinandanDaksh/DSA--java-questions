import java.util.Scanner;

public class NumbersPyramid {

    public static void numbersPyramid(int n){
        for(int i =1;i<=n;i++){
            for(int  j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        numbersPyramid(n);
    }
}
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5


