public class Day24 {
    public static void printSpiring(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int startrow=0;
        int endrow=n-1;
        int startcol=0;
        int endcol=m-1;

        while(startrow<=endrow && startcol<=endcol){

            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            // System.out.println();
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+" ");
            }

            for(int j=endcol-1;j>=startcol;j--){
                System.out.print(arr[endrow][j]+" ");
            }

            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(arr[i][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        printSpiring(matrix);
    }
    
}
