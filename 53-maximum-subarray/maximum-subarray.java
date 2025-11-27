class Solution {
    public int maxSubArray(int[] nums) {
        int temp = 0,max_sum = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            temp+=nums[i];
            max_sum = Math.max(temp,max_sum);
            if(temp<0){
                temp = 0;

            }
            

        }
        return max_sum;

    }
}