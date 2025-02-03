class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        Arrays.sort(nums);
        int idx=nums.length/2;
        return nums[idx];
    }
}