import java.util.ArrayList;
import java.util.*;
public class Nov18 {
    // static void fun(int num){
    //     if(num<=0){
    //         return;
    //     }
    //     System.out.println(num);
    //     fun(num-1);
    //     fun(num-2);
    // }
    // public static void main(String[] args) {
    //     fun(3);
        
    // }
    static ArrayList<String> subSequences(String m){
        if(m.length()==0){
            ArrayList<String> list =new ArrayList<>();
            list.add(" ");
            return list;
        }
        char singleChar =m.charAt(0);
        String subString =m.substring(1);
        ArrayList<String> list =subSequences(subString);
        ArrayList<String> newList = new ArrayList<>();
        
        for(String s : list) {
            newList.add(s);
            newList.add(singleChar+s);
        }
        return newList;

    }

    public static void main(String[] args) {
        System.out.println(subSequences("amit"));
        
    }
    
}
