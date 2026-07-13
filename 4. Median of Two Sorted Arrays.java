class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ultinums = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            ultinums[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            ultinums[nums1.length+i]=nums2[i];
        }
        Arrays.sort(ultinums);
        int n = ultinums.length;
        double median = 0.0;
        if(n%2!=0) median=ultinums[n/2];
        else median = (ultinums[n/2] + ultinums[n/2-1]) /2.0;
        return median; 
    }
}
