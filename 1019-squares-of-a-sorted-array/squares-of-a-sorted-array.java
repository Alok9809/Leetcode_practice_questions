class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0,end = nums.length-1;
        int[] res = new int[nums.length];
        int l = nums.length-1;
        while(start<=end){
            if(Math.abs(nums[start])>Math.abs(nums[end])){
                res[l] = nums[start]*nums[start];
                start++;
            }else{
                res[l] = nums[end]*nums[end];
                end--;
            }
            l--;
        }
        return res;
    }

}