class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0,j = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int maxWin = 0;
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            maxWin = Math.max(maxWin,map.get(s.charAt(j)));
        while(j-i+1-maxWin>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}