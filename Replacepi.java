import java.util.*;
public class Replacepi{
    static String replace( String str)
{
    if(str.length() <=1){
        return str;
    }
    if (str.charAt(0) == 'p' && str.length()>=2
    && str.charAt(1) == 'i'){
        return "3.14" + replace(str.substring(2,str .length()));
    }
    return str.charAt(0) +replace(str.substring(1 ,str.length()));
}
public static void main(String arg[])
{
    // replacepi =new replace();
    String str ="i+pi*4-pi*6";
    System.out.println(replace(str));
}
}