class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ultinums = new int[m+n];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0) continue;
            else ultinums[i] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==0) continue;
            else ultinums[m+i] = nums2[i];
        }
        Arrays.sort(ultinums);
        for(int i=0;i<nums1.length;i++) nums1[i]=ultinums[i];
    }
}

//THIS IS A BAD SOLUTION  XXXXXX
