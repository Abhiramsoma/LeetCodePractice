class Solution {
    public int numIdenticalPairs(int[] nums) {
      int count=0;  
        HashMap<Integer,Integer> hm = new HashMap<>(); 
      for(int i=0;i<nums.length;i++){
          if(hm.containsKey(nums[i])){
              count = count + hm.get(nums[i]);
              hm.put(nums[i],hm.get(nums[i])+1);
          }      
          else{
              hm.put(nums[i],1);
          }
      } 
       return count;
    }
}