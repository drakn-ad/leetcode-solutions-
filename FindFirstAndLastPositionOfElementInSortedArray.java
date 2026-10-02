class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums , target);
        int last = findLast(nums , target);
        return new int[] {first,last};
        
    }
    private int findFirst(int[] nums, int target) {
        int l = 0,h = nums.length-1;
        int ans = -1;
        while(l <= h) {
            int mid = l + (h-l) /2;
            if(nums[mid] == target) {
                ans = mid;
                h = mid-1;
            }else if(nums[mid] <= target){
                l = mid + 1;
            }else {
                h = mid -1;
            }
        }
        return ans;
    }
    private int findLast(int[] nums, int target) {
        int l = 0,h = nums.length-1;
        int ans = -1;
        while(l <= h) {
            int mid = l + (h-l) /2;
            if(nums[mid] == target) {
                ans = mid;
                l = mid+1;
            }else if(nums[mid] <= target){
                l = mid + 1;
            }else {
                h = mid - 1;
            }
        }
        return ans;
    }
}
