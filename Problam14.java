class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans =new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String End=strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),End.length());i++){
            if(first.charAt(i)!=End.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();

        
        
    }
}
