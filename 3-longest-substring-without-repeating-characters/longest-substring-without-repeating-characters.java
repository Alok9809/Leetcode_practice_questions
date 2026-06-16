class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int[] freq = new int[128];
        while(right<s.length()){
            while(freq[s.charAt(right)]>0){
                freq[s.charAt(left)]--;
                left++;

            }
            freq[s.charAt(right)]++;
            maxlen = Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}