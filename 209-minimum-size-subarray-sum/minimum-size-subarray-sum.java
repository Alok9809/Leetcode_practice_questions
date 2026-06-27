class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0,j=0,currsum = 0,len = Integer.MAX_VALUE;
        while(j<nums.length){
            currsum += nums[j];
            while(currsum>=target){
                currsum -= nums[i];
                len = Math.min(len,j-i+1);
                i++;
            }
            
            j++;
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}