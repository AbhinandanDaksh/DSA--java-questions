class Solution{
    public String removeConsecutiveCharacter(String S){
        String res="";
        for(int i=0;i<S.length();i++){
            if(i<S.length()-1 && S.charAt(i)==S.charAt(i+1)){
                continue;
            }
            else{
                res+=S.charAt(i);
            }
        }
        return res;
    }
}
