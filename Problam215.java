class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        for(int i=n-1;i>=0;i--){
            count++;
            if(count==k){
                return nums[i];
            }
        }
        return 1;
    }
}
