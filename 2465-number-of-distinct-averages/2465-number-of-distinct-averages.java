class Solution {
    public int distinctAverages(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        Arrays.sort(nums);
        HashSet<Double> hs=new HashSet<>();
        while(i<=j){
            Double sum = (nums[i]+nums[j])/2.0;
            hs.add(sum);
            i++;
            j--;
        }
        return hs.size();
    }
}