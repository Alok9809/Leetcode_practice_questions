class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isUnique(s, i, j)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }else{
                    break;
                }
            }
        }

        return maxLen;
    }

    private boolean isUnique(String s, int start, int end) {
        boolean[] visited = new boolean[128];

        for (int i = start; i <= end; i++) {
            char ch = s.charAt(i);
            if (visited[ch]) {
                return false;
            }
            visited[ch] = true;
        }

        return true;
    }
}