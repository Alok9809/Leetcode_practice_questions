class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length+nums2.length];
        int start = 0;
        for(int i =0;i<nums1.length+nums2.length;i++){
            if(start<nums1.length){
                merge[i] = nums1[start++];
            }else{
                merge[i] = nums2[i-start];
            }
        }
        Arrays.sort(merge);
        if(merge.length%2==0){
            return (double)(merge[merge.length/2]+merge[merge.length/2-1])/2;
        }else{
            return (double)merge[merge.length/2];
        }
    }
}