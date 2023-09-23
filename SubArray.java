import java.util.*;
public class SubArray {
    public static void pair(int arr[]){
        int count=0;
        int res=0;
        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
         
                            

            for(int j=i;j<arr.length;j++){
                
                count++;
                int sum=0;
                for(int m=i;m<=j;m++){
                    System.out.print(arr[m]);
                    sum+=arr[m];
                    res+=arr[m];
                    if(sum>max){
                        
                        max=sum;
                    }
                    if(res<min){
                        min=res;
                    }
                    
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,0,5};
        pair(arr);
    }
}


// sub arrayes:  
// 2
// 24
// 240
// 2405
// 4
// 40
// 405
// 0
// 05
// 5
// 

// max: 11
// min: 2
// Total Nubers of SubArray: 10
