class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> types = new HashSet<>();
        int canEat = candyType.length / 2;
        for(int i:candyType){
            if(types.size()>canEat){
                return canEat;
            }
            types.add(i);
        }
        return Math.min(canEat, types.size());
    }
}