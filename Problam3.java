class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int left=0;
        int right=0;
        int n=s.length();
        Set<Character> map=new HashSet<>();
        for(; right<n;right++){
            if(!map.contains(s.charAt(right))){
                map.add(s.charAt(right));
                res=Math.max(res,right-left+1);
            }
            else{
                while(map.contains(s.charAt(right))){
                    map.remove(s.charAt(left));
                    left++;
                }
                map.add(s.charAt(right));

            }

        }
    return res;
        
    }
}


//  b c a b c b b 
