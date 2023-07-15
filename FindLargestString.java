public class FindLargestString {
   
    public static void main(String[] args) {
        String str[] = {"apple","bnanana","manggo"};
        String larggest = str[0];
        // findlargestString(str[]);
        for(int i=1;i<str.length;i++){
            if(larggest.compareTo(str[i])<0){
                larggest=str[i];
            }
        }
        System.out.println(larggest);
    }
}
// compelxity=O(n*m)
