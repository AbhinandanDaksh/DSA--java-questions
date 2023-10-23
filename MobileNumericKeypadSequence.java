public class Day26 {
    public static void main(String[] args) {
         String str="abhinandan";
         String arr[]
            = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };
        String output="";
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' '){
                output = output+"0";
            }
            else{
                int position=str.charAt(i)-'a';
                output = output+arr[position];

            }
        }
        System.out.println("Output: "+output);
    }
    
}
