class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        

        while(left<right){
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }
            if(numbers[left]+numbers[right]>target){
                
                right--;
            }
            if(numbers[left]+numbers[right]<target){
                
                left++;
            }
            

        }
        return new int[]{};
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i =0;i<numbers.length;i++){
        //     int left = target-numbers[i];
        //     if(map.containsKey(left)){
        //         return new int[]{map.get(left)+1,i+1};
        //     }
        //     map.put(numbers[i],i);
        // }
        // return new int[]{};
    }
}