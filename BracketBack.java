import java.util.ArrayList;
import java.util.List;

public class BracketBack {
    static List<String> generate(int n){
        List<String> result= new ArrayList<>();
        helaper(result, "", 0, 0, n);
        return result;

    }
    static List<String> helaper(List<String> ans,String currebracket,int open,int close,int max){
        if(currebracket.length()==max*2){
            ans.add(currebracket);
            return ans;
        }
        if(open<max){
            helaper(ans, currebracket+"(", open+1, close, max);
        }
        if(close<open){
            helaper(ans, currebracket+")", open, close+1, max);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(generate(3));
    }
    
}
