class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0;
        int end=n-1;
        int max=0;
        while(start<end){
            int min =Math.min(height[start],height[end]);
            max=Math.max(max,min*(end-start));
            if(height[end]<height[start]){
                end--;
            }
            else{
                start++;
            }
        }
        return max;
        
    }
}
