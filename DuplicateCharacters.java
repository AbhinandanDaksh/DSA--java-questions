
public class Day25 {

public static void main(String[] args) {
    String str="geeksforgeeks";
    int n=str.length();
    int arr[]=new int[256];
    for(int i=0;i<n;i++){
        arr[str.charAt(i)]++;
    }
    for(int i=0;i<256;i++){
        if(arr[i]>1){
            System.out.println((char)i+" , count= "+arr[i]);
        }
    }
 }   
}
