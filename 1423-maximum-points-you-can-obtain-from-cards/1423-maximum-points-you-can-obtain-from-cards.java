class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0, rightsum=0, maxsum=0, n=cardPoints.length;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }
        maxsum=leftsum;
        int idx=n-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=cardPoints[i];
            rightsum+=cardPoints[idx];
            idx--;
            maxsum=Math.max(maxsum, leftsum+rightsum);
        }
        return maxsum;
    }
}