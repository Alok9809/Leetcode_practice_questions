class Solution {
    public int countPartitions(int[] nums) {
        int i = 0,j = nums.length-1;
        int count = 0;
        while(i<nums.length-1){
            int sum1 = sum(nums,0,i);
            int sum2 = sum(nums,i+1,nums.length-1);
            if((sum1-sum2)%2==0){
                count++;
            }
            i++;j--;
        }
        return count;
    }
    public int sum(int[] nums,int i,int j){
        int result = 0;
        for(int start = i;start<=j;start++){
            result+=nums[start];
        }
        return result;
    }
}