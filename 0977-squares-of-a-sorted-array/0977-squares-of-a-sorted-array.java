class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int right=nums.length-1;
        int left=0;
        int resultindex=result.length-1;
        while(left<=right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                result[resultindex]=nums[left]*nums[left];
                left++;
            }
            else{
                result[resultindex]=nums[right]*nums[right];
                right--;
            }
            resultindex--;
        }
        return result;
    }
}