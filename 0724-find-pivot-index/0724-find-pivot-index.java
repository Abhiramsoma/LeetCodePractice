class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=totalSum-leftSum-nums[i];
            if(leftSum==rightsum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}