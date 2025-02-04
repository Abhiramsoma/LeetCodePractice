class Solution {
    public int maxAscendingSum(int[] nums) {
        int currentsum=nums[0];
        int maxsum=currentsum;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currentsum+=nums[i];
            }
            else{
                currentsum=nums[i];
            }
            maxsum=Math.max(maxsum, currentsum);
        }
        return maxsum;
    }
}