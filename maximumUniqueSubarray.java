class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l = 0;
        int sum = 0;
        int mx_sum = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int right = 0;right<nums.length;right++) {
            sum += nums[right];
            while(hs.contains(nums[right])) {
                hs.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            mx_sum = Math.max(mx_sum,sum);
            hs.add(nums[right]);
        }
        return mx_sum;
    }
}
/*
⚔️══════ D R A K E N ══════⚔️
*/
