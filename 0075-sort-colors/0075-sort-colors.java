class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int noofzeroes=0, noofones=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) noofzeroes++;
            if(nums[i]==1) noofones++;
        }
        for(int i=0;i<n;i++){
            if(i<noofzeroes) nums[i]=0;
            else if(i<noofzeroes+noofones) nums[i]=1;
            else nums[i]=2;
        }
    }
}