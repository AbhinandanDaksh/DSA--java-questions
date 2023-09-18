import java.util.Scanner;

public class InverterPyramid {
    public static void inverterPyramid(int n){
        for(int i=1;i<=n;i++){
            
                for(int k=1;k<=n-i;k++){
                    System.out.print("  ");
                }
                for(int m=1;m<i+1;m++){
                    System.out.print(" *");
                }
            
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        inverterPyramid(row);

    }
}

//     *
//    **
//   ***
//  ****
// *****
