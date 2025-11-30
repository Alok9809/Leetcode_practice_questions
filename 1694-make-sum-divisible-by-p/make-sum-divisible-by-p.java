class Solution {
  public int minSubarray(int[] nums, int p) {

    long sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    int remainder = (int) (sum % p);
    if (remainder == 0)
      return 0;
    int ans = nums.length;
    int prefix = 0;
    Map<Integer, Integer> prefixToIndex = new HashMap<>();
    prefixToIndex.put(0, -1);

    for (int i = 0; i < nums.length; ++i) {
      prefix += nums[i];
      prefix %= p;
      int target = (prefix - remainder + p) % p;

      if (prefixToIndex.containsKey(target)) {
        ans = Math.min(ans, i - prefixToIndex.get(target));
      }

      prefixToIndex.put(prefix, i);
    }

    if (ans == nums.length) {
      return -1;
    } else {
      return ans;
    }
  }
}
