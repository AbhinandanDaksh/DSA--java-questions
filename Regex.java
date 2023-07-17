import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
    String a="(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    // String a="([01]?[1-9][0-9])?";
    // String b="(2[0-4][0-9])";
    // String c="(25[0-5])";
    // String A=a.concat(b).concat(c);
    // String B=a.concat(b).concat(c);
    // String C=a.concat(b).concat(c);
    // String D=a.concat(b).concat(c);
    public String pattern=a;
}
//Write your code here
