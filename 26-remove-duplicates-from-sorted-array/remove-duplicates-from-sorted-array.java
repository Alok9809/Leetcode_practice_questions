class Solution {
    public int removeDuplicates(int[] nums) {
        
        int a = 0;
        int b = 1;
        int ok = 1;

        while(b<nums.length){
            if(nums[a]!=nums[b]){
                nums[ok++] = nums[b];
            }
            a++;b++;
        }
        return ok;
    }
}