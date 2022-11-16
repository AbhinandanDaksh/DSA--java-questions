import java.util.*;
public class AdjacentStar {
    static String p="";
    public static void Star(String input,int i ) {
        p =p+input.charAt(i);
        if(i==input.length()-1){
            return ;
        }
        if(input.charAt(i)==input.charAt(i+1)){
            p = p + '*';
        }
        Star(input,i+1);
        
    }
    public static void main(String[] args) {
        String input ="meenu";
        // System.out.println(Star(input,0));
        Star(input,0);
        System.out.println(p);
        
    }
    
}
