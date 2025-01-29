class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] numbersSmaller=new int[n];
        for(int i=0;i<n;i++){
            int larger=0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    larger+=1;
                    numbersSmaller[i]=larger;
                }
            }
        }
        return numbersSmaller;
    }
}