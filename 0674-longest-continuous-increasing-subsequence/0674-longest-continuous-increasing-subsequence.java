class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1) return 1;
        int max=0,prev=nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>prev) count++;
            else count=1;
            if(count>max) max=count;
            prev=nums[i];
        }
        return max;
    }
}