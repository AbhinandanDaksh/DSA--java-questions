class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        boolean[][] isPalindrome = new boolean[n][n];

        // Single characters are palindromes
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
            count++;
        }

        // Check palindromes for substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                count++;
            }
        }

        // Check palindromes for substrings of length > 2
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && isPalindrome[i + 1][j - 1]) {
                    isPalindrome[i][j] = true;
                    count++;
                }
            }
        }

        return count;
    }
}


// dp


class Solution {
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(pailndrom(s.substring(i,j))){
                    count++;
                }
            }
        }
        return count;
        
    }
    private boolean pailndrom(String s){
        int l=0;
        int r=s.length()-1;
        while(l<=r && s.charAt(l)==s.charAt(r)){
            l++;
            r--;
        }
        return l>=r;
    }
}




// normal string 
