class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<=1){
            return s;
        }
        int maxLen=1;
        String maxStr=s.substring(0,1);
        for(int i=0;i<n;i++){
            for(int j=i+maxLen;j<=n;j++){
                if(j-i>maxLen && ispalindrom(s.substring(i,j))){
                    maxLen=j-i;

                    maxStr=s.substring(i,j);
                }

            }
        }
        return maxStr;
        
    }
    private boolean ispalindrom(String str){
        int left =0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


// b a b a d
