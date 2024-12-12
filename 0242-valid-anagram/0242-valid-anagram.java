class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> a = new HashMap<>();
        Map<Character, Integer> b = new HashMap<>();
        for(int i=0;i<s.length();i++){
            a.put(s.charAt(i), a.getOrDefault(s.charAt(i), 0) + 1);
            b.put(t.charAt(i), b.getOrDefault(t.charAt(i), 0) + 1);
        }
        for(char c='a';c<='z';c++){
            if(!a.getOrDefault(c, 0).equals(b.getOrDefault(c, 0))){
                return false;
            }
        }
        return true;
    }
}