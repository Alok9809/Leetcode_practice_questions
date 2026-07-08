class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int start = 0,end = 0;
        int freq[] = new int[128];
        int max = Integer.MIN_VALUE;
        
        
        while(end<s.length()){
            freq[s.charAt(end)]++;
            while(freq[s.charAt(end)]>1){
                freq[s.charAt(start)]--;
                start++;
                

            }
            max = Math.max(max,end-start+1);
            end++;
        }
        return max;
    }
}