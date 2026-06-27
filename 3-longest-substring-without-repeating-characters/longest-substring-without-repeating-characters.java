class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int[] freq = new int[128];
        int i = 0,j = 0,max = -1;
        while(j<s.length()){
            freq[s.charAt(j)]++;
            while(freq[s.charAt(j)]>1){
                freq[s.charAt(i)]--;
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}