class Solution {
    public boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!alpha(s.charAt(left))){
                left++;
            }
            else if(!alpha(s.charAt(right))){
                right--;
            }
            else if(uppercase(s.charAt(left)) != uppercase(s.charAt(right))){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
        
    }


private boolean alpha(char s){
    if( ('a'<=s && s<='z')||('A'<=s && s<='Z')||('0'<=s && s<='9')){
        return true;
    }
    else{
        return false;
    }
    
}
private char uppercase(char s){
    if('a'<= s && s<='z'){
        return s;
    }
    else{
        return (char)((int)s+32);
    }
    // return s.toUpperCase();
} 
}
