class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0;i<numbers.length;i++){
            int left = target-numbers[i];
            int index = binarySearch(numbers,left,i);
            if(index!=-1){
                return new int[]{Math.min(i,index)+1,Math.max(i,index)+1};
            }
        }
        return new int[]{};
    }
    public static int binarySearch(int[] numbers,int target,int f){
        int start = 0,end = numbers.length-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(numbers[mid]==target&&mid!=f){
                    return mid;
                }else if(numbers[mid]<target){
                    start = mid+1;

                }else{
                    end = mid-1;
                }
                
                
            }
            return -1;
    }
}