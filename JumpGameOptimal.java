class Solution {
    public boolean canJump(int[] nums) {
        int mxInd = 0;
        for(int i=0;i<nums.length;i++) {
            if(i > mxInd) return false;
            mxInd = Math.max(mxInd, i+nums[i]);
            if(mxInd >= nums.length-1) return true;
        }
        return true;
    }
}
