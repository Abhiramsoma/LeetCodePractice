class Solution {
    public int heightChecker(int[] heights) {
        int len=heights.length, count=0;
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=heights[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<len;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;

       
    }
}